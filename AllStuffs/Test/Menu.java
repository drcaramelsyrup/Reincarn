package slick.Test;

import org.newdawn.slick.Color;
import org.newdawn.slick.Game;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.state.transition.FadeInTransition;
import org.newdawn.slick.state.transition.FadeOutTransition;

 
public class Menu extends Level{
    
	private int ID = 1;
	private StateBasedGame game; // stored for later use
	//private Input input;
	
    @Override
    public void init(GameContainer container, StateBasedGame game)
            throws SlickException {
    	this.game = game;
    	//this.input = container.getInput();
        // TODO Auto-generated method stub
 
    }
 
    @Override
    public void render(GameContainer container, StateBasedGame game, Graphics g)
            throws SlickException {
        // TODO Auto-generated method stub
    	//g.drawRect(640, 50, 40, 100);
    	g.drawString("START", 640, 360);
 
    }
 
    @Override
    public void update(GameContainer container, StateBasedGame game, int delta)
            throws SlickException {
        // TODO Auto-generated method stub
 
    }
 
    @Override
    public int getID() {
        // TODO Auto-generated method stub
        return ID;
    }
    
    public void keyReleased(int key, char c) {
        switch(key) {
        case Input.KEY_ENTER:
            game.enterState(2, new FadeOutTransition(Color.black), new FadeInTransition(Color.black));
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