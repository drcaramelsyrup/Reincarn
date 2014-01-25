import org.newdawn.slick.SlickException;
import org.newdawn.slick.SpriteSheet;


public class Bear extends Player{
	public Bear(){
		super.setName("Bear");
		super.loc.setX(0);
		super.loc.setY(0);
		try {
			super.mySprites = new SpriteSheet(name + ".png", 34, 34, 0);
		} 
		catch(SlickException e){
			System.out.println("Image failed to load");
		}
	}

}
