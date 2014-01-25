import org.newdawn.slick.SlickException;
import org.newdawn.slick.SpriteSheet;
import org.newdawn.slick.Animation;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;


public class Bear extends Player{
	int jumpH;
	int Speed;
	public Bear(){
		jumpH = 1;
		Speed = 1;
		super.setName("Bear");
		super.loc.setX(0);
		super.loc.setY(0);
		super.mySprites= new Animation[4];
		makeAnimation();
	}
	void makeAnimation(){
		Image Bear1R = new Image("Sprites/Bear1.png");
		Image Bear2R = new Image("Sprites/Bear2.png");
		Image Bear1L = new Image("Sprites/Bear1L.png");
		Image Bear2L = new Image("Sprites/Bear2L.png");
		Image Bear3R = new Image("Sprites/Bear3.png");
		Image Bear3L = new Image("Sprites/Bear3L.png");
		
		Image[] BearMR = {Bear1R, Bear2R};
		Image[] BearML = {Bear1L, Bear2L};
		Image[] BearPR = {Bear2R, Bear3R};
		Image[] BearPL = {Bear2L, Bear3L};
		Animation BearR = new Animation(BearMR, 300, false);
		Animation BearL = new Animation(BearML, 300, false);
		Animation BearPushR = new Animation(BearPR, 300, false);
		Animation BearPushL = new Animation(BearPL, 300, false);
		mySprites.add(BearR);
		mySprites.add(BearL);
		mySprites.add(BearPushR);
		mySprites.add(BearPushL);
	}
}
