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

 
public class levelOne extends Level{
    
	private int ID = 2;
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
    	super.render(container, game, g);
    	g.drawString("HELLO", 40, 100);
 
    }
 
    @Override
    public void update(GameContainer container, StateBasedGame game, int delta)
            throws SlickException {
    	super.update(container, game, delta);
        // TODO Auto-generated method stub
 
    }
 
    @Override
    public int getID() {
        // TODO Auto-generated method stub
        return ID;
    }
    
    public void keyReleased(int key, char c) {
        switch(key) {
        case Input.KEY_1:
            game.enterState(1, new FadeOutTransition(Color.black), new FadeInTransition(Color.black));
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