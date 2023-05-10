package Versao2;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class CircleView extends JPanel {
    private CircleModel model;

    public CircleView(CircleModel model) {
        this.model = model;
        setPreferredSize(new Dimension(500, 500));
        setBackground(new Color(0, 0, 0, 0));
        setOpaque(false);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(model.getColor());
        Ellipse2D circle = model.getShape();
        g2.fill(circle);
    }

    public void update() {
        repaint();
    }
}
