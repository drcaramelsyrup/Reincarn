package slick.Test;

import org.newdawn.slick.SlickException;
import org.newdawn.slick.SpriteSheet;
import org.newdawn.slick.Animation;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;


public class Plant extends Player{

	public Plant(){
		super();
		super.jumpH = -1;
		super.speed = 0;
		super.setName("Plant");
		super.loc = new Location(0, 0);
		//super.loc.setX(0);
		//super.loc.setY(0);
		super.mySprites = new Animation[1];
		makeAnimation();
	}
	void makeAnimation(){
		try{
		Image Plant1 = new Image("Sprites/Plant1.png");
		Image Plant2 = new Image("Sprites/Plant2.png");
		Image[] PlantM = {Plant1, Plant2};
		Animation PlantMove = new Animation(PlantM, 300, false);
		mySprites[0] = PlantMove;
		}
		catch(SlickException e){
			System.out.println("Image failed to load");
		}
		
		
	}

}
