/**
 * This is the Cloud class that contains the drawing of the Cloud.
 * The Cloud class takes in 1 color and is made up of 3 different elements.
 *
 * @author Alec Wang
 * @version March 3 2020
 */

/*
I have not discussed the Java language code 
in my program with anyone other than my instructor 
or the teaching assistants assigned to this course.

I have not used Java language code obtained 
from another student, or any other unauthorized 
source, either modified or unmodified.

If any Java language code or documentation 
used in my program was obtained from another source, 
such as a text book or webpage, those have been 
clearly noted with a proper citation in the comments 
of my code.
*/
import java.awt.*;
import java.awt.geom.*;

public class Cloud{
	private int size;
	private int x;
	private int y; 
	private Color c1; 
	
	public Cloud(int s, int xAxis, int yAxis, Color color_1){
		size = s;
		x = xAxis;
		y = yAxis;
		c1 = color_1;
	}
	public void draw(Graphics2D g2d){
		Ellipse2D.Double o1 = new Ellipse2D.Double(x,y,size*1.15,size);
		Ellipse2D.Double o2 = new Ellipse2D.Double(x+30,y-40,size,size*1.3);
		Ellipse2D.Double o3 = new Ellipse2D.Double(x+60,y,size*1.15,size);
		g2d.setColor(c1);
		g2d.fill(o1);
		g2d.fill(o2);
		g2d.fill(o3);	
		
	}
}