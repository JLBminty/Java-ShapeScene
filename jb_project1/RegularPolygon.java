package jb_project1;
////////////////////////////////////////
/* 
 * Jordan Burns
 * Jan 24 2024
 * Project 1
 * RegularPolygon-type SolidPolygon-type Image object class
 * Equations on lines 22 and 23 from: Oliver Charlesworth
 * 		https://stackoverflow.com/questions/7198144/how-to-draw-a-n-sided-regular-polygon-in-cartesian-coordinates
 */ 
////////////////////////////////////////

import java.awt.Color;
import java.awt.Point;

public class RegularPolygon extends SolidPolygon{

	public RegularPolygon(Color color, int vertexCount, Point center, int radius) {
		super(color, vertexCount);
		int[] x_points = new int[vertexCount];
        int[] y_points = new int[vertexCount];
        for(int i=0; i<vertexCount; i++) {
        	x_points[i]=(int) (radius*Math.cos(2*Math.PI*i/vertexCount)) + center.x;
        	y_points[i]=(int) (radius*Math.sin(2*Math.PI*i/vertexCount)) + center.y;
        }
        createPolygon(x_points, y_points);
	}
	
}
