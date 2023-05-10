package Versao2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyListener;

public class CircleApplication {
    public static void main(String[] args) {

        CircleModel model = new CircleModel(250, 250, 10, Color.RED);
        CircleView view = new CircleView(model);
        CircleController controller = new CircleController(model, view);

        JFrame frame = new JFrame("Circle Application"); //cria um frame par aplicação

        frame.setUndecorated(true);//remove as bordas do frame
        frame.setBackground(new Color(0, 0, 0, 0));//remove o fundo do frame

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(view);//adiciona o panel no frame
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setAlwaysOnTop(true);
        frame.setVisible(true);
        frame.addKeyListener(controller);
    }
}






