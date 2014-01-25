import org.newdawn.slick.SlickException;
import org.newdawn.slick.SpriteSheet;

public class BasicEnemy extends Enemy {
	boolean hasObstacle = false;
	boolean isPlayer = false;
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
	
	private void moveMe() {
		if(hasObstacle == false){
			loc = loc.getAdjacentLoc(0);
		}
		else{
			if(isPlayer == false){
				
			}
		}
		
	}
}
