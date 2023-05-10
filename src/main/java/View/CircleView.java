package View;

import Model.Circle;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class CircleView extends JPanel {
    private Circle circle;

    public CircleView(Circle circle) {
        this.circle = circle;
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = (int) screenSize.getWidth();
        int screenHeight = (int) screenSize.getHeight();
        setPreferredSize(new Dimension(screenWidth, screenHeight));
        setBackground(new Color(0, 0, 0, 0));
        setOpaque(false);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(circle.getColor());
        Ellipse2D shape = circle.getShape();
        g2.fill(shape);
    }
}

