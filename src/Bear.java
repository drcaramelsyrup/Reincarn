package slick.Test;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.SpriteSheet;
import org.newdawn.slick.Animation;
import org.newdawn.slick.Graphics;
//import org.n slick.Test.Player;


public class Bear extends Player{
	int jumpH;
	int Speed;
	public Bear(){
		jumpH = 1;
		Speed = 1;
		super.setName("Bear");
		super.loc = new Location(0, 0);
		super.mySprites= new Animation[4];
		makeAnimation();
	}
	void makeAnimation(){
		
		try {
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
			mySprites[0] = (BearR);
			mySprites[1] = (BearL);
			mySprites[2] = (BearPushR);
			mySprites[3] = (BearPushL);
		} catch (SlickException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
