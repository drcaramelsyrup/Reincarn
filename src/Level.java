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

 
public class Level extends BasicGameState{
    
	private int ID;
	private StateBasedGame game; // stored for later use
	private Circle jingles = new Circle(100, 100, 100);
	private Graphics gr;
	private int hm = 10;
	
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
    	this.gr = g;
    	g.drawRect(100, 100, 100, 100);
    	g.draw(jingles);
    	
 
    }
 
    @Override
    public void update(GameContainer container, StateBasedGame game, int delta)
            throws SlickException {
        // TODO Auto-generated method stub
 
    }
 
    @Override
    public int getID() {
        // TODO Auto-generated method stub
        return this.ID;
    }
    
    //now for all the event handlers yay
    
    //jump
    public void keyPressed(int key, char c) {
		if (key == Input.KEY_SPACE) {
			hm += 1;
			gr.drawRect(this.hm, 100, 100, 100);
			System.out.println("hi");
		}
    }
    
 
}