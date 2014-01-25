import org.newdawn.slick.SlickException;
import org.newdawn.slick.SpriteSheet;
import org.newdawn.slick.Animation;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;



public class Fish extends Player{
	int jumpH;
	int Speed;
	public Fish(){
		super();
		super.setName("Fish");
		super.loc.setX(0);
		super.loc.setY(0);
		super.mySprites = new Animation[2];
		makeAnimation();
		jumpH = null;
		Speed = 2;
	}
	void makeAnimation(){
		Image Fish1R = new Image("Sprites/Fish1.png");
		Image Fish2R = new Image("Sprites/Fish2.png");
		Image Fish1L = new Image("Sprites/Fish1L.png");
		Image Fish2L = new Image("Sprites/Fish2L.png");
		Image[] FishMR = {Fish1R, Fish2R};
		Image[] FishML = {Fish1L, Fish2L};
		Animation FishR = new Animation(FishMR, 300, false);
		Animation FishL = new Animation(FishML, 300, false);
		mySprites.add(FishR);
		mySprites.add(FishL);
	}
}
