import org.newdawn.slick.SlickException;
import org.newdawn.slick.SpriteSheet;


public class Fish extends Player{
	public Fish(){
		super.setName("Fish");
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
