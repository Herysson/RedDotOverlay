package Versao2;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.io.FileWriter;
import java.io.IOException;

public class CircleModel {
    private int centerX;
    private int centerY;
    private int radius;
    private Color color;
    private int colorIndex = 0;
    private static final Color[] colors = {Color.RED, Color.GREEN, Color.BLUE};

    public CircleModel(int x, int y, int radius, Color color) {
        centerX = x;
        centerY = y;
        this.radius = radius;
        this.color = color;
    }

    public int getCenterX() {
        return centerX;
    }

    public int getCenterY() {
        return centerY;
    }

    public int getRadius() {
        return radius;
    }

    public Color getColor() {
        return color;
    }

    public void setCenterX(int x) {
        centerX = x;
    }

    public void setCenterY(int y) {
        centerY = y;
    }

    public void changeSize(int value){
        radius += value;
    }

    public void changeColor() {
        colorIndex = (colorIndex + 1) % colors.length;
        color = colors[colorIndex];
    }
    public Ellipse2D getShape() {
        return new Ellipse2D.Double(centerX - radius, centerY - radius, radius * 2, radius * 2);
    }
    public void saveConfigurationToFile(){
        //criar um comando para salvar a configuração
        try {
            FileWriter writer = new FileWriter("circleConfig.txt");
            writer.write(color.getRed() + "\n");
            writer.write(color.getGreen() + "\n");
            writer.write(color.getBlue() + "\n");
            writer.write(centerX + "\n");
            writer.write(centerY + "\n");
            writer.write(radius + "\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void loadConfigurationToFile() {
        //sempre que o programa for aberto fazer load da configuração.
    }
}
