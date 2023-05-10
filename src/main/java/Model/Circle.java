package Model;

import java.awt.*;
import java.awt.geom.Ellipse2D;

public class Circle {
    private int x;
    private int y;
    private int radius;
    private Color color;
    private int colorIndex = 0;
    private static final Color[] colors = {Color.RED, Color.GREEN, Color.BLUE};

    public Circle(int x, int y, int radius, Color color) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getRadius() {
        return radius;
    }

    public Color getColor() {
        return color;
    }

    public int getColorIndex() {
        return colorIndex;
    }

    public void moveLeft() {
        x -= 10;
    }

    public void moveRight() {
        x += 10;
    }

    public void moveUp() {
        y -= 10;
    }

    public void moveDown() {
        y += 10;
    }

    public void changeSize(){
        radius -= 2;
    }

    public void changeColor() {
        colorIndex = (colorIndex + 1) % colors.length;
        color = colors[colorIndex];
    }

    public Ellipse2D getShape() {
        return new Ellipse2D.Double(x - radius, y - radius, radius * 2, radius * 2);
    }

    @Override
    public String toString() {
        return "Position X: "+ x + "\nPosition Y: " + y + "\nRadius:" + radius +"\nColor: " + colors[colorIndex];
    }
}
