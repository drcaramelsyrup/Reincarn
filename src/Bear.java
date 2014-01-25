import org.newdawn.slick.SlickException;
import org.newdawn.slick.SpriteSheet;


public class Bear extends Player{
	public Bear(){
		super.setName("Bear");
		super.loc.setX(0);
		super.loc.setY(0);
		super.mySprites= new SpriteSheet[3];
		for(int i=1; i<4; i++){
			try {
				super.mySprites[i-1] = new SpriteSheet(name + i".png", 34, 34, 0);
			} 
			catch(SlickException e){
				System.out.println("Image failed to load");
			}
		}
	}

}
