package shapes;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Line extends Shapes {

	/**
	 * 
	 */

	// Movement
	boolean movingLeft;
	boolean movingUp;

	private int xPos1 = 12;
	private int yPos1 = 12;
	private int xPos2 = 24;
	private int yPos2 = 34;
	private Color color;

	public Line(int x, int y, int s, Color c) {
		super(x, y, s, c);
	}

	public int getX() {
		return xPos1;
	}

	public int getY() {
		return yPos1;
	}

	public void setColor(Color c) {
		color = c;
	}

	@Override
	public void drawShape(Graphics g) {
		g.setColor(color);
		g.drawLine(xPos1, yPos1, xPos2, yPos2);
	}

	@Override
	public void move() {
		switch (Facing) {
		case 0:
			yPos--;
			break;
		case 1:
			xPos++;
			break;
		case 2:
			yPos++;
			break;
		case 3:
			xPos--;
			break;
		case 4:
			xPos++;
			yPos--;
			break;
		case 5:
			xPos++;
			yPos++;
			break;
		case 6:
			xPos--;
			yPos++;
			break;
		case 7:
			xPos--;
			yPos--;
			break;
		default:
		}
	}

	public void corner(int n) {

		Facing = r.nextInt(3);
	}

	Random r = new Random();

	@Override
	public void collision() {
		HEALTH -= 2;
		int nf;
		if (FlatLandMain.selectedMovement == 0) {
			nf = Facing;
			while (nf == Facing) {
				nf = r.nextInt(4);
			}
		} else {
			while (true) {
				nf = r.nextInt(8);
				if (nf == Facing)
					continue;
				if (Facing == 0) {
					if (nf == 7 || nf == 0 || nf == 4)
						continue;
				}
				if (Facing == 1) {
					if (nf == 4 || nf == 1 || nf == 5)
						continue;
				}
				if (Facing == 2) {
					if (nf == 5 || nf == 2 || nf == 6)
						continue;
				}
				if (Facing == 3) {
					if (nf == 7 || nf == 3 || nf == 6)
						continue;
				}
				if (Facing == 4) {
					if (nf == 7 || nf == 0 || nf == 4 || nf == 1 || nf == 5)
						continue;
				}
				if (Facing == 5) {
					if (nf == 4 || nf == 1 || nf == 5 || nf == 2 || nf == 6)
						continue;
				}
				if (Facing == 6) {
					if (nf == 5 || nf == 2 || nf == 6 || nf == 3 || nf == 7)
						continue;
				}
				if (Facing == 7) {
					if (nf == 6 || nf == 3 || nf == 7 || nf == 0 || nf == 4)
						continue;
				}
				break;
			}
		}
		Facing = nf;
		// corner();

	}

	public void manhattan() {
		switch (Facing) {
		case 0:
			if (yPos <= 90)
				collision();
			break;
		case 1:
			if (xPos >= 800)
				collision();
			break;
		case 2:
			if (yPos >= 800)
				collision();
			break;
		case 3:
			if (xPos <= 0)
				collision();
			break;
		case 4:
			if (xPos >= 800) {
				collision();
				break;
			}
			if (yPos <= 90)
				collision();
			break;
		case 5:
			if (xPos >= 800) {
				collision();
				break;
			}
			if (yPos >= 800)
				collision();
			break;
		case 6:
			if (xPos <= 0) {
				collision();
				break;
			}
			if (yPos >= 800)
				collision();
			break;
		case 7:
			if (xPos <= 0) {
				collision();
				break;
			}
			if (yPos <= 90)
				collision();
			break;
		}

		move();

	}
}
