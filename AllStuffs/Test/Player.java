package slick.Test;
//import Actor;



import org.newdawn.slick.SpriteSheet;
import org.newdawn.slick.Animation;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;

public class Player implements Actor {
	Animation[] mySprites;
	String name;
	Location loc;
	double x, y;
	int jumpH;
	int speed;
	int[] velocity = {0, 0};
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
	public void setDeathStatus(boolean death) {
	        this.death = death;
	}
	public void updateLoc (double x, double y) {
		loc.setX(x); loc.setY(y);
	}
	public Location getLoc () {
		return this.loc;
	}
	
	
	@Override
	public Animation[] getSprites() {
		// TODO Auto-generated method stub
		return mySprites;
	}
}
