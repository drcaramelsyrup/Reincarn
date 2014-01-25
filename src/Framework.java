package slick.Test;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;
 
public class Framework extends StateBasedGame{
 
    /**
     * @param args
     */
	//private Input input;
    public static void main(String[] args) {
        // TODO Auto-generated method stub
    	try
		{
			AppGameContainer appgc;
			appgc = new AppGameContainer(new Framework("REBORNNNNNN"));
			appgc.setDisplayMode(1280, 720, false);
			//appgc.setMinimumLogicUpdateInterval(17);
			//appgc.setSmoothDeltas(true);
			appgc.setTargetFrameRate(60);
			appgc.start();
		}
		catch (SlickException ex)
		{
			Logger.getLogger(SimpleSlickGame.class.getName()).log(Level.SEVERE, null, ex);
		}
    }
 
    public Framework(String name) {
        super(name);
    }
    
    public void keyPressed(int key, char c) {
		if (key == Input.KEY_ESCAPE) {
			System.exit(0);
		}
    }
 
    @Override
    public void initStatesList(GameContainer container) throws SlickException {
        // TODO Auto-generated method stub
    	addState(new Menu());
    	addState(new levelOne());
 
    }
 
}