package slick.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import org.newdawn.slick.Color;
import org.newdawn.slick.Game;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Circle;
import org.newdawn.slick.gui.TextField;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.state.transition.FadeInTransition;
import org.newdawn.slick.state.transition.FadeOutTransition;
import org.newdawn.slick.tiled.TiledMap;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;

 
public class Level extends BasicGameState{
	Clip clip; 
	public Player player;
	public String type = "";
	int ID;
	private StateBasedGame game; // stored for later use
	private Circle jingles = new Circle(100, 100, 100);
	private Input input;
	public float x = 80, y = 260;
	boolean isLeft = false;
	private TiledMap levelMap;
	private boolean[][] blocked;
	private boolean[][] water; 
	private boolean[][] suicide; 
	private ArrayList<Enemy> enemyList = new ArrayList<Enemy>();
	String mapName = "maps/level1.tmx";
	
	boolean jump = false;
	//private Input input;
	
    @Override
    public void init(GameContainer container, StateBasedGame game)
            throws SlickException {
    	this.game = game;
    	this.input = container.getInput();
    	playBGM();
    	levelMap = new TiledMap(mapName);
    	levelMap.render((int)x, (int)y);
    	blocked = new boolean[levelMap.getWidth()][levelMap.getHeight()];
    	water = new boolean[levelMap.getWidth()][levelMap.getHeight()];
    	suicide = new boolean[levelMap.getWidth()][levelMap.getHeight()];
    	
    	//this.input = container.getInput();
        // TODO Auto-generated method stub
    	
    	for (int xax = 0; xax < levelMap.getWidth(); xax++)
        {
            for (int yax = 0; yax < levelMap.getHeight(); yax++)
            {
                int ID = levelMap.getTileId(xax, yax, 0);
                System.out.println(ID);
                String value = "false";
                if (ID < 1000 && ID >0)
                //value = levelMap.getTileProperty(ID, "blocked" , "false");
               
                if ("true".equals(value))
                {
                    blocked[xax][yax] = true;
                   
                }
            }
        }
        for (int xax = 0; xax < levelMap.getWidth(); xax++)
        {
            for (int yax = 0; yax < levelMap.getHeight(); yax++)
            {
                int ID = levelMap.getTileId(xax, yax, 0);
                String value = "false"; //levelMap.getTileProperty(ID, "water" , "false");
                if ("true".equals(value))
                {
                    water[xax][yax] = true;
                   
                }
                
            }
        }
        for (int i = 0; i < levelMap.getWidth(); i++)
        {
            for (int j = 5; j < levelMap.getHeight(); j++)
            {
                if (!blocked[i][j-4] && !blocked[i][j-3] && !blocked[i][j-2] && !blocked[i][j-1] && !blocked[i][j])
                    suicide[i][j-5] = true;
            }
        }
 
    }
    private void playBGM(){
		try {
		AudioInputStream stream = AudioSystem.getAudioInputStream(new File("Sound/BGM.wav"));
		AudioFormat format = stream.getFormat();
		if (format.getEncoding() != AudioFormat.Encoding.PCM_SIGNED) {
			format = new AudioFormat(
			    AudioFormat.Encoding.PCM_SIGNED,
			    format.getSampleRate(),
			    format.getSampleSizeInBits()*2,
			    format.getChannels(),
			    format.getFrameSize()*2,
			    format.getFrameRate(),
			    true);        
		    stream = AudioSystem.getAudioInputStream(format, stream);
		}
		DataLine.Info info = new DataLine.Info(Clip.class, stream.getFormat(), ((int)stream.getFrameLength()*format.getFrameSize()));
		clip = (Clip) AudioSystem.getLine(info);
		clip.open(stream);
		System.out.println("Clip is: normal");
		//clip2.stop();
		clip.start();
		clip.loop(clip.LOOP_CONTINUOUSLY);
		} catch (Exception e) {System.err.println("Problem with sound loading \n"+ e);}
		System.out.println("Sound is loaded.");
		}	
 
    @Override
    public void render(GameContainer container, StateBasedGame game, Graphics g)
            throws SlickException {
        // TODO Auto-generated method stub
    	
    	g.drawRect(100, 100, 100, 100);
    	g.draw(jingles);
    	
    	
 
    }
 
    @Override
    public void update(GameContainer container, StateBasedGame game, int delta)
            throws SlickException {
        // TODO Auto-generated method stub
    	if (!isBlocked(x, y+player.velocity[1])) {
    		y += player.velocity[1];
    		player.getLoc().setY(player.getLoc().getY() - player.velocity[1]); 
    	}
    	else {
    		player.velocity[1] = 0;
    	}
    	if (!player.isFly() && !player.isFish()) {
            player.velocity[1] -= 1;
            if (player.velocity[1] < -3) {
            	if (isBlocked(x, y-player.speed))
            		fallDeath();
            }
    	}
    		
    	if(input.isKeyDown(Input.KEY_LEFT)){
    		//System.out.println("left: " + (x + player.speed));
    		if (!isBlocked(x + player.speed, y)) {
    			x += player.speed;
    			player.getLoc().setX(player.getLoc().getX() - player.speed); 
	    		isLeft = true;
    		}
    	}
    	if(input.isKeyDown(Input.KEY_RIGHT)){
    		if (!isBlocked(x - player.speed, y)) {
	    		x -= player.speed;
	    		player.getLoc().setX(player.getLoc().getX() + player.speed); 
	    		isLeft = false;
    		}
    	}
    	if(input.isKeyDown(Input.KEY_UP)){
    		if (!isBlocked(x, y+player.speed) && player.jumpH == 0){
    			y += player.speed;
    			player.getLoc().setY(player.getLoc().getY() - player.speed); 
    		}
    	}
    	if(input.isKeyDown(Input.KEY_DOWN)){
    		if (!isBlocked(x, y-player.speed) && player.jumpH == 0){
    			
        		y -= player.speed;
        		player.getLoc().setY(player.getLoc().getY() + player.speed); 
        		
    		}
    	}
    	
 
    }
    
    public boolean isBlocked(double dx, double dy) {
    	int xBlock = (int)Math.round((-dx + 640)/ 34);
    	//System.out.println("x: " + xBlock);
    	int yBlock = (int)Math.round((-dy + 360)/ 34);
    	//System.out.println("y: " + yBlock);
    	//System.out.println(levelMap.getWidth());
    	
    	if (xBlock >= levelMap.getWidth() || yBlock >= levelMap.getHeight() || xBlock * yBlock == 0)
    		return true;
    	else if (blocked[xBlock][yBlock] && dy < y || yBlock >= levelMap.getHeight())
    		jump = false;
    	else if (player.isFish())
    		return (blocked[xBlock][yBlock] || !water[xBlock][yBlock]);
    	else if (player.isFly())
    		return (blocked[xBlock][yBlock] || water[xBlock][yBlock]);
    	return blocked[xBlock][yBlock];
    }
 
    @Override
    public int getID() {
        // TODO Auto-generated method stub
        return this.ID;
    }
    
    //now for all the event handlers yay
    
    public void keyPressed(int key, char c) {
		if (key == Input.KEY_ESCAPE) {
			System.exit(0);
		}
		else if (key == Input.KEY_UP && jump == false && player.jumpH > 0){
			player.velocity[1] += player.jumpH * 10;
			jump = true;
		}
		else if (key == Input.KEY_RIGHT){
			//x += 2.0;
		}
		else if (key == Input.KEY_LEFT){
			//x -= 2.0;
		}
    }
    
    public void setMapName(String s) {
    	this.mapName = s;
    }
    
    public TiledMap getMap() {
    	return levelMap;
    }
    
    public ArrayList<Enemy> getEnemyList() {
    	return enemyList;
    }
    
    public void fallDeath() {
    	player = new Fly();
    	exhaustionDeath();
    	//player.updateLoc(player.getLoc().getX(), player.getLoc().getY());
    }
    
    public void exhaustionDeath() {
    	Timer flyLife = new Timer();
    	flyLife.schedule(new TimerTask() {
    		@Override
    		public void run() {
    			player = new Bear();
    		}
    	},5*1000);
    }
    
    public void checkForEnemyDeath() {
    	for (int i = 0; i < getEnemyList().size(); i++) {
    		//System.out.println(getEnemyList().get(i).getLoc().getX());
    		//System.out.println("x" + player.getLoc().getX());
    		//System.out.println(player.getLoc().getY());
    		if (!player.isPlant()){
    		if (Math.abs(player.getLoc().getX() - getEnemyList().get(i).getLoc().getX())
    				<= 34 && Math.abs(player.getLoc().getY() - getEnemyList().get(i).getLoc().getY()) <= 34) {
    			enemyDeath();
    			//System.out.println("death");
    		}
    		}
    	}
    }
    
    public void enemyDeath() {
    	if (player.isHuman()) {
    		player.setDeathStatus(true);
    		return;
    	}
    	player = new Human();
    }
    
    public void drowningDeath() {
    	if (!player.isFish() && water[(int)player.getLoc().getX() / 34][(int)player.getLoc().getY() / 34]) {
    		Timer drowning = new Timer();
        	drowning.schedule(new TimerTask() {
        		@Override
        		public void run() {
        			player = new Fish();
        		}
        	},6*1000);
    	}
    }
    
    public void plantDeath() {
    	Timer plantLife = new Timer();
    	plantLife.schedule(new TimerTask() {
    		@Override
    		public void run() {
    			player = new Fly();
    			exhaustionDeath();
    		}
    	},5*1000);
    }

    
 
}