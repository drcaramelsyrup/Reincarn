import org.newdawn.slick.SlickException;
import org.newdawn.slick.SpriteSheet;


public class Fly extends Player{
	public Fly(){
		super.setName("Fly");
		super.loc.setX(0);
		super.loc.setY(0);
		super.mySprites = new SpriteSheet[2];
		for(int i=1; i<3; i++){
			try {
				super.mySprites[i-1] = new SpriteSheet(name+i + ".png", 34, 34, 0);
			} 
			catch(SlickException e){
				System.out.println("Image failed to load");
			}
		}
	}
}
