import org.newdawn.slick.SlickException;
import org.newdawn.slick.SpriteSheet;

public class BasicEnemy extends Enemy {
	public BasicEnemy(Location loc) {
		setName("BasicEnemy");
		this.loc = loc;
		try {
			mySprites = new SpriteSheet(name + ".png", 34, 34, 0);
		} 
		catch (SlickException e) {
			System.out.println("Image failed to load");
		}
	}
}
