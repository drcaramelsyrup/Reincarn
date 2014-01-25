
import org.newdawn.slick.SpriteSheet;
import org.newdawn.slick.Animation;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;

public class Player implements Actor {
	Animation[] mySprites;
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
	public Animation[] getSprites() {
		// TODO Auto-generated method stub
		return mySprites;
	}
}
