package slick.Test;
//import java.awt.Color;

import org.newdawn.slick.SlickException;
import org.newdawn.slick.SpriteSheet;
import org.newdawn.slick.Animation;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;


public class Human extends Player{
	public Human(){
		super();
		super.jumpH = 3;
		super.speed = 2;
		super.setName("Human");
		super.loc = new Location(0, 0);
		super.mySprites = new Animation[4];
		makeAnimation();
	}
	void makeAnimation(){
		try {
			Image Human1R = new Image("Sprites/Human1.png");
			Image Human2R = new Image("Sprites/Human2.png");
			Image Human1L = new Image("Sprites/Human1L.png");
			Image Human2L = new Image("Sprites/Human2L.png");
			Image Human3R = new Image("Sprites/Human3.png");
			Image Human3L = new Image("Sprites/Human3L.png");
			Image[] HumanMR = {Human1R, Human2R};
			Image[] HumanML = {Human1L, Human2L};
			Image[] HumanJR = {Human3R, Human3R};
			Image[] HumanJL = {Human3L, Human3L};
			Animation HumanR = new Animation(HumanMR, 300, false);
			Animation HumanL = new Animation(HumanML, 300, false);
			Animation HumanJumpR= new Animation(HumanJR, 300, false);
			Animation HumanJumpL = new Animation(HumanJL, 300, false);
			mySprites[0] = (HumanR);
			mySprites[1] = (HumanL);
			mySprites[2] = (HumanJumpR);
			mySprites[3] = (HumanJumpL);
		} catch (SlickException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
