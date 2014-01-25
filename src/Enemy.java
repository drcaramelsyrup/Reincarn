import org.newdawn.slick.*;

public class Enemy implements Actor{
	SpriteSheet mySprites;
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
	public SpriteSheet getSprites() {
		// TODO Auto-generated method stub
		return mySprites;
	}
}