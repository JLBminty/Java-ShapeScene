package jb_project1;
////////////////////////////////////////
/* 
* Jordan Burns
* Jan 29 2024
* Project 1
* Text-type Image object class
*/ 
////////////////////////////////////////

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class Text extends Image {

	String phrase;
	Point leftPoint;
	
	public Text(Color color, String phrase, Point left_point) {
		super(color);
		this.phrase = phrase;
		this.leftPoint = left_point;
	}

	@Override
	void draw(Graphics graphics) {	
		colorDrawing(graphics);
		graphics.drawString(phrase, leftPoint.x, leftPoint.y);
	}

}
