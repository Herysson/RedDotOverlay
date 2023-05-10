package Controller;

import Model.Circle;
import View.CircleView;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class CircleController implements KeyListener {
    private Circle circle;
    private CircleView view;

    public CircleController(Circle circle, CircleView view) {
        this.circle = circle;
        this.view = view;
        view.addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        int keyCode = e.getKeyCode();
        if (keyCode == KeyEvent.VK_LEFT) {
            circle.moveLeft();
        } else if (keyCode == KeyEvent.VK_RIGHT) {
            circle.moveRight();
        } else if (keyCode == KeyEvent.VK_UP) {
            circle.moveUp();
        } else if (keyCode == KeyEvent.VK_DOWN) {
            circle.moveDown();
            System.out.println(circle.toString());
        } else if (keyCode == KeyEvent.VK_F2) {
            circle.changeSize();
        } else if (keyCode == KeyEvent.VK_F3) {
            circle.changeColor();
        }
        view.repaint();
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
