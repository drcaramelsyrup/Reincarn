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

 
public class levelOne extends Level{
    
	private int ID = 2;
	private StateBasedGame game; // stored for later use
	//private Graphics gr;
	private Input input;
	private Image bear1;
	private Image bear2;
	public Animation bear;
	public Animation sprite;
	public Plant plant;
	public Bear b;
	public Fish fish;
	public Fly fly;
	public Human human;
	String mapName = "maps/level1.tmx";
	
	
	
    @Override
    public void init(GameContainer container, StateBasedGame game
    		String mapName)
            throws SlickException {
    	super.init(container, game, mapName);
    	this.game = game;
    	bear1= new Image("Sprites/Bear1.png");
    	bear2= new Image("Sprites/Bear2.png");
    	Image[] bearMvmt = {bear1, bear2};
    	bear = new Animation(bearMvmt, 300, false);
    	sprite = bear;
    	plant = new Plant();
    	b = new Bear();
    	fish = new Fish();
    	fly = new Fly();
    	human = new Human();
    	
        // TODO Auto-generated method stub
 
    }
 
    @Override
    public void render(GameContainer container, StateBasedGame game, Graphics g)
            throws SlickException {
        // TODO Auto-generated method stub
    	super.render(container, game, g);
    	//super.getLevelMap().render((int)x, (int)y);
    	g.drawString("HELLO", 40, 100);
    	sprite.draw(640, 360);
    	plant.mySprites[0].draw(100, 200);
    	b.mySprites[2].draw(300, 400);
    	fish.mySprites[0].draw(640, 400);
    	fly.mySprites[0].draw(640, 450);
    	human.mySprites[0].draw(640, 500);
    	
    	
 
    }
 
    @Override
    public void update(GameContainer container, StateBasedGame game, int delta)
            throws SlickException {
    	super.update(container, game, delta);
        // TODO Auto-generated method stub
  
    	sprite.update(delta);
    	plant.mySprites[0].update(delta);
    	b.mySprites[2].update(delta);
    	fish.mySprites[0].update(delta);
    	fly.mySprites[0].update(delta);
    	human.mySprites[0].update(delta);
    	
 
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