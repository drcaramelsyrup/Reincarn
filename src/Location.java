package slick.Test;

public class Location{
	int xCoord;
	int yCoord;
	final int RIGHT = 0;
	final int LEFT = 180;
	public Location(int X, int Y){
		xCoord = X;
		yCoord = Y;
	}
	int getX(){
		return this.xCoord;
	}
	int getY(){
		return this.yCoord;
	}
	void setY(int y){
		this.yCoord = y;
	}
	void setX(int x){
		this.xCoord = x;
	}
	Location getAdjacentLoc(int dir){
		if (dir == 0) {
			Location rightLoc = new Location(xCoord+1, yCoord);
			return rightLoc;
		}
		else if (dir == 90) {
			Location upLoc = new Location(xCoord, yCoord);
			return upLoc;
		}
		else if (dir == 180) {
			Location leftLoc = new Location(xCoord+1, yCoord);
			return leftLoc;
		}
		else {
			Location downLoc = new Location(xCoord+1, yCoord);
			return downLoc;
		}
	}
}

