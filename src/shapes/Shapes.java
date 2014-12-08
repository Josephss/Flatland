package shapes;

import java.awt.Color;
import java.awt.Graphics;

public class Shapes {

	public int Facing = 0;
	public int HEALTH;
	public Color color;
	public int xPos, yPos, size, radius;

	public Shapes(int x, int y, int s, Color c) {
		xPos = x;
		yPos = y;
		size = s;
		radius = size / 2;
		color = c;
		HEALTH += 10000;
	}

	public void drawShape(Graphics g) {
	}

	public void move() {
	}

	public void collision() {
	}

	public int movementType;

	// ArrayList to hold unlimited shapes
	public int getFacing() {
		return Facing;
	}

	public void update() {
		this.manhattan();
		HEALTH--;
	}

	public boolean hasCollided(Shapes e) {
		int shapeXpos = e.xPos;
		int shapeYpos = e.yPos;
		if (shapeXpos >=xPos - 24 && shapeXpos <= xPos + 24 * 2 && shapeYpos + 24 >= yPos && shapeYpos < yPos) {
			return true;
		}
		if (shapeXpos >= xPos - 24 && shapeXpos <=xPos + 24 * 2 && shapeYpos <= yPos + 24 && shapeYpos > yPos) {
			return true;
		}
		if (shapeYpos >= yPos - 24 && shapeYpos <= yPos + 24 * 2 && shapeXpos + 24 >= xPos && shapeXpos < xPos) {
			return true;
		}
		if (shapeYpos >= yPos - 24 && shapeYpos <= yPos + 24 * 2 && shapeXpos <= xPos + 24 && shapeXpos > xPos) {
			return true;
		}
		return false;
	}
	
	public void flipShape() {
		HEALTH -= 3;
		if (Facing == 0) {
			Facing = 2;
			return;
		}
		if (Facing == 4) {
			Facing = 6;
			return;
		}
		if (Facing == 1) {
			Facing = 3;
			return;
		}
		if (Facing == 5) {
			Facing = 7;
			return;
		}
		if (Facing == 2) {
			Facing = 0;
			return;
		}
		if (Facing == 6) {
			Facing = 4;
			return;
		}
		if (Facing == 3) {
			Facing = 1;
			return;
		}
		if (Facing == 7) {
			Facing = 5;
			return;
		}
	}

	public void manhattan() {
	}

	public int getX() {
		return xPos;
	}

	public int getY() {
		return yPos;
	}
}
