
import org.newdawn.slick.SpriteSheet;

public class Player implements Actor {
	SpriteSheet[] mySprites;
	String name;
	Location loc;
	public Player(){
		
	}
	public void setName(String s){
		name = s;
	}
	public String getName(){
		return name;
	}
	//public Player dea
	@Override
	public SpriteSheet[] getSprites() {
		// TODO Auto-generated method stub
		return mySprites;
	}
}
