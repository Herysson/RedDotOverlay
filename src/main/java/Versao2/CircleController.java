package Versao2;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class CircleController implements KeyListener {
    private CircleModel model;
    private CircleView view;

    public CircleController(CircleModel model, CircleView view)  {
        this.model = model;
        this.view = view;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        if (keyCode == KeyEvent.VK_LEFT) {
            model.setCenterX(model.getCenterX() - 2);
        } else if (keyCode == KeyEvent.VK_RIGHT) {
            model.setCenterX(model.getCenterX() + 2);
        } else if (keyCode == KeyEvent.VK_UP) {
            model.setCenterY(model.getCenterY() - 2);
        } else if (keyCode == KeyEvent.VK_DOWN) {
            model.setCenterY(model.getCenterY() + 2);
        } else if (keyCode == KeyEvent.VK_MINUS) {
            model.changeSize(-2);
        }else if (keyCode == KeyEvent.VK_PLUS || keyCode == KeyEvent.VK_EQUALS) {
            model.changeSize(2);
        } else if (keyCode == KeyEvent.VK_F3) {
            model.changeColor();
        }
        view.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}