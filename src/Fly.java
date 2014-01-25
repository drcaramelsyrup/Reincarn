import org.newdawn.slick.SlickException;
import org.newdawn.slick.SpriteSheet;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;

public class Fly extends Player{
	int jumpH;
	int Speed;
	public Fly(){
		super();
		super.setName("Fly");
		super.loc.setX(0);
		super.loc.setY(0);
		super.mySprites = new Animation[2];
		jumpH = null;
		Speed = 3;
		makeAnimation();
	}
	makeAnimation(){
		Image Fly1R = new Image("Sprites/Fly1.png");
		Image Fly2R = new Image("Sprites/Fly2.png");
		Image Fly1L = new Image("Sprites/Fly1L.png");
		Image Fly2L = new Image("Sprites/Fly2L.png");
		Image[] flyMR = {Fly1R, Fly2R};
		Image[] flyML = {Fly1L, Fly2L};
		Animation flyR = new Animation(flyMR, 300, false);
		Animation flyL = new Animation(flyML, 300, false);
		mySprites.add(flyR);
		mySprites.add(flyL);
		
	}
}
