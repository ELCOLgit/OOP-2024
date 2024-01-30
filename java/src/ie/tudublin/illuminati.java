package ie.tudublin;

import processing.core.PApplet;

public class illuminati extends PApplet {

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
        background(252, 3, 3);
        stroke(252, 244, 3);
        fill(252, 244, 3);
        circle(250, 300, 400);
        
        fill(3, 252, 235);
        stroke(3, 252, 235);
        triangle(400, 400, 245, 20, 60, 400);
        
        fill(227, 230, 229);
        stroke(227, 230, 229);
        ellipse(250, 300, 200, 100);

        fill(0, 0, 0);
        stroke(0, 0, 0);
        circle(250, 300, 100);
        


    }
    
}
