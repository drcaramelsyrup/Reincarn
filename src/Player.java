
import org.newdawn.slick.SpriteSheet;
import org.newdawn.slick.Animation;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;

public class Player implements Actor {
	Animation[] mySprites;
	String name;
	Location loc;
	boolean death;
	public Player(){
		death = false;
	}
	public void setName(String s){
		name = s;
	}
	public String getName(){
		return name;
	}
	// to determine player type
	public boolean isBear() {
		return (this instanceof Bear);
	}
	public boolean isFish(){
		return (this instanceof Fish);
	}
	public boolean isFly(){
		return (this instanceof Fly);
	}
	public boolean isHuman(){
		return (this instanceof Human);
	}
	public boolean isPlant(){
		return (this instanceof Plant);
	}
	// set player's status
	public setDeathStatus(boolean death) {
		this.death = death;
	}
	@Override
	public Animation[] getSprites() {
		// TODO Auto-generated method stub
		return mySprites;
	}
}
