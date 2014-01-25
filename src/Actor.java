package slick.Test;
import org.newdawn.slick.SpriteSheet;
import org.newdawn.slick.Animation;

public interface Actor {
	Animation[] getSprites();
	public boolean isOnGround();
}
