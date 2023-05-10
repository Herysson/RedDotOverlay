package Versao1;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.Ellipse2D;
import javax.swing.JPanel;

public class OverlayComponent extends JPanel implements KeyListener {

    private int centerX;
    private int centerY;
    private int radius = 10;
    private Color[] colors = {Color.RED, Color.GREEN, Color.BLUE};
    private int currentColorIndex = 0;

    public OverlayComponent() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = (int) screenSize.getWidth();
        int screenHeight = (int) screenSize.getHeight();
        setPreferredSize(new Dimension(screenWidth, screenHeight));
        setBackground(new Color(0, 0, 0, 0));
        setOpaque(false);
        centerX = screenWidth/ 2;
        centerY = screenHeight/ 2;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(colors[currentColorIndex]);
        Ellipse2D circle = new Ellipse2D.Double(centerX - radius, centerY - radius, radius * 2, radius * 2);
        g2.fill(circle);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        if (keyCode == KeyEvent.VK_LEFT) {
            centerX -= 10;
        } else if (keyCode == KeyEvent.VK_RIGHT) {
            centerX += 10;
        } else if (keyCode == KeyEvent.VK_UP) {
            centerY -= 10;
        } else if (keyCode == KeyEvent.VK_DOWN) {
            centerY += 10;
        } else if (keyCode == KeyEvent.VK_F2) {
            radius -= 2;
        } else if (keyCode == KeyEvent.VK_F3) {
            currentColorIndex++;
            if (currentColorIndex >= colors.length) {
                currentColorIndex = 0;
            }
        }

        repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // Not used
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // Not used
    }
}
