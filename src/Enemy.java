import org.newdawn.slick.*;

public class Enemy implements Actor{
	Animation[] mySprites;
	String name;
	Location loc;
	public Enemy(){

	}
	public void setName(String s){
		name = s;
	}
	public String getName(){
		return name;
	}
	@Override
	public Animation[] getSprites() {
		// TODO Auto-generated method stub
		return mySprites;
	}
	public boolean isOnGround(){
		String g = "ground";
		return (g.equals(getTileProperty(getTileId(loc.getX(), 
				loc.getY(), 1)), "ground", ""));
		// if the tile the thing is on has the "ground" property
	}
}