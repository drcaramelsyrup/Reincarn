package slick.Test;

import org.newdawn.slick.Animation;
import org.newdawn.slick.Color;
import org.newdawn.slick.Game;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.state.transition.FadeInTransition;
import org.newdawn.slick.state.transition.FadeOutTransition;
import org.newdawn.slick.tiled.TiledMap;
import java.lang.Math;

 
public class levelOne extends Level{
    
	private int  ID = 2;
	private StateBasedGame game; // stored for later use
	//private Graphics gr;
	private Input input;
	//private TiledMap grassMap;
//	private Image bear1;
//	private Image bear2;
//	public Animation bear;
//	public Animation sprite;
//	public Plant plant;
//	public Bear b;
//	public Fish fish;
//	public Fly fly;
//	//public Human human;
	public BasicEnemy BE;
//	public FlyEnemy FlE;
//	public FollowEnemy FE;
	String mapName = "maps/level1.tmx";
	private TiledMap levelMap;
	
	
	
    @Override
    public void init(GameContainer container, StateBasedGame game)
            throws SlickException {
    	//super.setMapName(mapName);
    	super.init(container, game);
    	this.game = game;
    	//grassMap = new TiledMap("maps/level0.tmx");
//    	bear1= new Image("Sprites/Bear1.png");
//    	bear2= new Image("Sprites/Bear2.png");
//    	Image[] bearMvmt = {bear1, bear2};
//    	bear = new Animation(bearMvmt, 300, false);
//    	sprite = bear;
//    	plant = new Plant();
//    	b = new Bear();
//    	fish = new Fish();
//    	fly = new Fly();
    	//human = new Human();
    	player = new Fly();
    	player.updateLoc(640 - x,360 - y);
    	type = "fly";
    	BE = new BasicEnemy((int)(300), (int)(100));
    	getEnemyList().add(BE);
//    	FlE = new FlyEnemy(300,500);
//    	getEnemyList().add(FlE);
//    	FE = new FollowEnemy(400, 450);
//    	getEnemyList().add(FE);
        // TODO Auto-generated method stub
 
    }
 
    @Override
    public void render(GameContainer container, StateBasedGame game, Graphics g)
            throws SlickException {
    	super.render(container, game, g);
    	super.getMap().render((int)x, (int)y);
    	//super.getMap().render(0, 0);
    	g.drawString("HELLO", 40, 100);
    	//sprite.draw(640, 360);
    	//plant.mySprites[0].draw(100, 200);
    	if(super.isLeft == false){
    		
//    		b.mySprites[2].draw(300, 400);
//    		fish.mySprites[0].draw(640, 400);
//    		fly.mySprites[0].draw(640, 450);
    		player.mySprites[0].draw(640,360);
    		
//    		FlE.mySprites[0].draw(300,500);
//    		FE.mySprites[0].draw(400,450);
    	}
    	else{
//    		b.mySprites[3].draw(300, 400);
//    		fish.mySprites[1].draw(640, 400);
//    		fly.mySprites[1].draw(640, 450);
    		player.mySprites[1].draw(640,360);
//    		BE.mySprites[1].draw(300,450);
//    		FlE.mySprites[1].draw(300,500);
//    		FE.mySprites[1].draw(400,450);
    	}
    	BE.mySprites[0].draw(300 + x,100 + y);
    	
    	
    	
 
    }
 
    @Override
    public void update(GameContainer container, StateBasedGame game, int delta)
            throws SlickException {
    	super.update(container, game, delta);
        // TODO Auto-generated method stub
    	if(super.isLeft == true){
//    		b.mySprites[3].update(delta);
//        	fish.mySprites[1].update(delta);
//        	fly.mySprites[1].update(delta);
        	player.mySprites[1].update(delta);
//        	BE.mySprites[1].update(delta);
//        	FlE.mySprites[1].update(delta);
//        	FE.mySprites[1].update(delta);
    	}
    	else{
    		//sprite.update(delta);
//    		plant.mySprites[0].update(delta);
//    		b.mySprites[2].update(delta);
//    		fish.mySprites[0].update(delta);
//    		fly.mySprites[0].update(delta);
    		player.mySprites[0].update(delta);
//    		BE.mySprites[0].update(delta);
//    		FlE.mySprites[0].update(delta);
//    		FE.mySprites[0].update(delta);
    	}
    	super.checkForEnemyDeath();

    }
 
    @Override
    public int getID() {
        // TODO Auto-generated method stub
        return this.ID;
    }
    
    

    
    public void keyReleased(int key, char c) {
        switch(key) {
        case Input.KEY_1:
            game.enterState(1, new FadeOutTransition(Color.black), new FadeInTransition(Color.black));
			System.out.println("hi");
            break;
        case Input.KEY_2:
            // TODO: Implement later
            break;
        case Input.KEY_3:
            // TODO: Implement later
            break;
        default:
            break;
        }
    }
 
}