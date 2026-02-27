package jb_project1;
////////////////////////////////////////
/* 
 * Jordan Burns
 * Jan 26 2024
 * Project 1
 * IsoscelesTriangle-type SolidPolygon-type Image object class
 */ 
////////////////////////////////////////

import java.awt.Color;
import java.awt.Point;

public class IsoscelesTriangle extends SolidPolygon {

	public IsoscelesTriangle(Color color, int vertexCount, Point topPoint, int height, int width) {
		super(color, 3);
		int[] x_points = {topPoint.x, topPoint.x + (width/2), topPoint.x - (width/2)};
        int[] y_points = {topPoint.y, topPoint.y + (height), topPoint.y + (height)};
        createPolygon(x_points, y_points);
	}

}
