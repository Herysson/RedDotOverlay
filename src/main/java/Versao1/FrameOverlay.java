package Versao1;

import javax.swing.*;
import java.awt.*;

public class FrameOverlay {
    FrameOverlay(){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setUndecorated(true);
        frame.setBackground(new Color(0, 0, 0, 0));
        OverlayComponent overlay = new OverlayComponent();
        frame.add(overlay);
        frame.pack();
        Dimension screen = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((screen.getWidth() - frame.getWidth()) / 2);
        int y = (int) ((screen.getHeight() - frame.getHeight()) / 2);
        frame.setLocation(x, y);
        frame.setAlwaysOnTop(true);
        frame.setVisible(true);
        frame.addKeyListener(overlay);
    }
}
