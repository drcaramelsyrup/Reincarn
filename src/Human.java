//import java.awt.Color;

import org.newdawn.slick.SlickException;
import org.newdawn.slick.SpriteSheet;

public class Human extends Player{
	public Human(){
		super.setName("Human");
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
