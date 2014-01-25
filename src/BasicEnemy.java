import org.newdawn.slick.SlickException;
import org.newdawn.slick.SpriteSheet;

public class BasicEnemy extends Enemy {
	boolean hasObstacle = false;
	boolean isPlayer = false;
	super.mySprites = new Animation[2];
	public BasicEnemy(Location loc) {
		setName("BasicEnemy");
		this.loc = loc;
		makeAnimation();
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
	void makeAnimation(){
		try{
			Image BE1R = new Image("Sprites/BasicEnemy1.png");
			Image BE2R = new Image("Sprites/BasicEnemy2.png");
			Image BE1L = new Image("Sprites/BasicEnemy1L.png");
			Image BE2L = new Image("Sprites/BasicEnemy2L.png");
			Image[] BEMovR = {BE1R, BE2R};
			Image[] BEMovL = {BE1L, BE2L};
			Animation BEMR = new Animation(BEMovR, 300, false);
			Animation BEML = new Animation(BEMovL, 300, false);
			mySprites[0]= BEMR;
			mySprites[1]= BEML;
			}
			catch(SlickException e){
				System.out.println("Image failed to load");
			}
	}
}
