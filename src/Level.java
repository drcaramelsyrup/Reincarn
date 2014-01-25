package slick.Test;

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

 
public class Level extends BasicGameState{
    
	private int ID;
	private StateBasedGame game; // stored for later use
	private Circle jingles = new Circle(100, 100, 100);
	//private Graphics gr;
	//private int hm = 10;
	private Input input;
	public float x = 34f, y = 34f;
	
	
	//private Input input;
	
    @Override
    public void init(GameContainer container, StateBasedGame game)
            throws SlickException {
    	//this.game = game;
    	this.input = container.getInput();
    	
    	//this.input = container.getInput();
        // TODO Auto-generated method stub
 
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
    	// player movement
    	if (!isOnGround()) {
    		y -= 2.0;
    	}
    	if(input.isKeyDown(Input.KEY_LEFT)){
    		x -= 2.0;
    	}
    	if(input.isKeyDown(Input.KEY_RIGHT)){
    		x += 2.0;
    	}
 
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
		else if (key == Input.KEY_UP){
			
		}
		else if (key == Input.KEY_RIGHT){
			//x += 2.0;
		}
		else if (key == Input.KEY_LEFT){
			//x -= 2.0;
		}
    }

    
 
}