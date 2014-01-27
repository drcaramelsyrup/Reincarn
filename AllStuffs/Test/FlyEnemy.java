package slick.Test;

import org.newdawn.slick.Animation;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.SpriteSheet;

public class FlyEnemy extends Enemy {
	
	public FlyEnemy(int x, int y) {
		super.mySprites = new Animation[2];
		setName("FlyEnemy");
		this.loc = new Location(x,y);
		makeAnimation();
	}
	void makeAnimation(){
		try{
			Image FlE1R = new Image("Sprites/FlyEnemy1.png");
			Image FlE2R = new Image("Sprites/FlyEnemy2.png");
			Image FlE1L = new Image("Sprites/FlyEnemy1L.png");
			Image FlE2L = new Image("Sprites/FlyEnemy2L.png");
			Image[] FlEMovR = {FlE1R, FlE2R};
			Image[] FlEMovL = {FlE1L, FlE2L};
			Animation FlEMR = new Animation(FlEMovR, 300, false);
			Animation FlEML = new Animation(FlEMovL, 300, false);
			mySprites[0]= FlEMR;
			mySprites[1]= FlEML;
			}
			catch(SlickException e){
				System.out.println("Image failed to load");
			}
	}
}