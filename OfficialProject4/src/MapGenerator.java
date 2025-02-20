import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.Timer;

public class MapGenerator {
	int map[][];
	private int brickWidth;
	private int brickHeight;

	public int getBrickWidth(){return brickWidth;}
	public int getBrickHeight(){return brickHeight;}

	public MapGenerator(int row, int col) {
		map = new int[row][col];
		for(int i = 0; i<map.length; i++) {
			for(int j = 0; j<map[0].length;j++) {
				map[i][j] = 1;
			}
		}
		brickWidth = 540/col;
		brickHeight = 150/row;
	}
	public void draw(Graphics2D g) {
		for(int i = 0; i<map.length; i++) {
			for(int j = 0; j<map[0].length;j++) {
				if(map[i][j] > 0) {
					g.setColor(Color.red);		
					g.fillRect(j * brickWidth + 80, i * brickHeight + 50, brickWidth, brickHeight);
					g.setStroke(new BasicStroke(3));
					g.setColor(Color.black);
					g.drawRect(j * brickWidth + 80, i * brickHeight + 50, brickWidth, brickHeight);
				}
			}
		}

	}
	public void setBrickValue(int value, int row, int col) {
		map[row][col] = value;		
	}

	}