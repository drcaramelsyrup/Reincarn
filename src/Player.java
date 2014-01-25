package slick.Test;
//import Actor;



import org.newdawn.slick.SpriteSheet;
import org.newdawn.slick.Animation;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.TiledMap;

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
	public boolean isOnGround(){
		String g = "ground";
		return (g.equals(getTileProperty(getTileId(loc.getX(), 
				loc.getY(), 1)), "ground", ""));
		// if the tile the thing is on has the "ground" property
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
