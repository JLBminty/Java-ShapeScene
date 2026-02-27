package jb_project1;
////////////////////////////////////////
/* 
 * Jordan Burns
 * January 26 2024
 * Project 1
 * Parallelogram-type SolidPolygon-type Image object class
 */ 
////////////////////////////////////////

import java.awt.Color;
import java.awt.Point;

public class Parallelogram extends SolidPolygon {

	public Parallelogram(Color color, int vertexCount, Point topLeft, Point bottomRight, int offset) {
		super(color, 4);
		int[] x_points = {topLeft.x, topLeft.x - offset, bottomRight.x, bottomRight.x + offset};
        int[] y_points = {topLeft.y, bottomRight.y, bottomRight.y, topLeft.y};
        createPolygon(x_points, y_points);
	}

}
