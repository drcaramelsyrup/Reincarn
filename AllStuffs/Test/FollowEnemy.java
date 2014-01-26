package slick.Test;

import org.newdawn.slick.Animation;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.SpriteSheet;

public class FollowEnemy extends Enemy {
	
	public FollowEnemy(int x, int y) {
		setName("FollowEnemy");
		super.mySprites = new Animation[2];
		this.loc = new Location(x,y);
		makeAnimation();
	}
	void makeAnimation(){
		try{
			Image FE1R = new Image("Sprites/FollowEnemy1.png");
			Image FE2R = new Image("Sprites/FollowEnemy2.png");
			Image FE1L = new Image("Sprites/FollowEnemy1L.png");
			Image FE2L = new Image("Sprites/FollowEnemy2L.png");
			Image[] FEMovR = {FE1R, FE2R};
			Image[] FEMovL = {FE1L, FE2L};
			Animation FEMR = new Animation(FEMovR, 300, false);
			Animation FEML = new Animation(FEMovL, 300, false);
			mySprites[0]= FEMR;
			mySprites[1]= FEML;
			}
			catch(SlickException e){
				System.out.println("Image failed to load");
			}
	}
}
