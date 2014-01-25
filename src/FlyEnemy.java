import org.newdawn.slick.SlickException;
import org.newdawn.slick.SpriteSheet;

public class FlyEnemy extends Enemy {
	public FlyEnemy(Location loc) {
		setName("FlyEnemy");
		this.loc = loc;
		try {
			mySprites = new SpriteSheet(name + ".png", 34, 34, 0);
		} 
		catch (SlickException e) {
			System.out.println("Image failed to load");
		}
	}
}
