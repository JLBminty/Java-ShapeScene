package jb_project1;
////////////////////////////////////////
/* 
 * Jordan Burns
 * Jan 26 2024
 * Project 1
 * Polygon_-type Image that is filled within its bounds
 * Is passed the number of vertices of the Polygon_ and its color
 */ 
////////////////////////////////////////


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

public class SolidPolygon extends Polygon_{

	public SolidPolygon(Color color, int vertexCount) {
		super(color, vertexCount);
	}

	public void drawPolygon(Graphics graphics, Polygon polygon) {
		graphics.fillPolygon(polygon);
		
	}

}
