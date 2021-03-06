/**
 * Description (in your own words) of the class goes here. 
 * This is the NinjaStar class. It contains an extra method beyond normal DrawingObjects that allows it to be rotated.
 *
 * @author Alec Wang
 * @version Aoril 1 2020
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

public class NinjaStar implements DrawingObject {
    private double X;
    private double Y;
    private int degrees;
    private Color color;

    public NinjaStar(double x, double y, Color color) {
        this.X = x;
        this.Y = y;
        this.color = color;
        degrees = 0;

    }

    @Override
    public void draw(Graphics2D g2d) {
        g2d.setColor(color);
        Path2D p = new Path2D.Double();
        g2d.rotate(Math.toRadians(-degrees), 825 + X, 717.5 + Y);
        p.moveTo(815 + X, 710 + Y);
        p.lineTo(835 + X, 710 + Y);
        p.lineTo(825 + X, 680 + Y);
        p.lineTo(815 + X, 710 + Y);
        Path2D p2 = new Path2D.Double();
        p2.moveTo(815 + X, 710 + 12.5 + Y);
        p2.lineTo(835 + X, 710 + 12.5 + Y);
        p2.lineTo(825 + X, 680 + 72.5 + Y);
        p2.lineTo(815 + X, 710 + 12.5 + Y);
        g2d.fill(p);
        g2d.fill(p2);
        g2d.rotate(Math.toRadians(90), 825 + X, 717.5 + Y);
        Path2D p3 = new Path2D.Double();
        p3.moveTo(815 + X, 710 + 12.5 + Y);
        p3.lineTo(835 + X, 710 + 12.5 + Y);
        p3.lineTo(825 + X, 680 + 72.5 + Y);
        p3.lineTo(815 + X, 710 + 12.5 + Y);
        g2d.fill(p3);
        g2d.rotate(Math.toRadians(-90), 825 + X, 717.5 + Y);
        g2d.rotate(Math.toRadians(-90), 825 + X, 717.5 + Y);
        Path2D p4 = new Path2D.Double();
        p4.moveTo(815 + X, 710 + 12.5 + Y);
        p4.lineTo(835 + X, 710 + 12.5 + Y);
        p4.lineTo(825 + X, 680 + 72.5 + Y);
        p4.lineTo(815 + X, 710 + 12.5 + Y);
        g2d.fill(p4);
        g2d.rotate(Math.toRadians(90), 825 + X, 717.5 + Y);
        g2d.fill(new Ellipse2D.Double(812.5 + X, 705 + Y, 25, 25));
        g2d.rotate(Math.toRadians(degrees), 825 + X, 717.5 + Y);

    }

    @Override
    public void adjustX(double distance) {
        X += distance;
    }

    @Override
    public double getX() {
        return X;
    }

    public void adjustRotation(int d) {
        degrees += d;
    }

    public int getRotation() {
        return degrees;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}