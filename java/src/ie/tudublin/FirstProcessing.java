package ie.tudublin;

import processing.core.PApplet;

public class FirstProcessing extends PApplet {
    public void settings()
	{
		size(500, 500);
	}

	public void setup() {
		
		
	}

	float x1, y1, x2, y2;
	float x1dir, x2dir, y1dir, y2dir;
	float c = 0;
	
	public void draw()
	{	
        background(200,210,755);
        stroke(0,255,700);
        fill(0,30,20);
		line(10,10,100,100); //x1,x2,y1,y2
        ellipse(200, 90, 80, 200);
        circle(200, 300, 80);
        rect(400, 300, 50,100); //x,y,w,h
        triangle(10, 200, 200, 200, 300, 400);


    }
}
