package CubeyPac;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class MyPanel extends JPanel implements ActionListener{

    Timer timer = new Timer(1000,this);
    int seconds = 0;

    public MyPanel() {
        timer.start();
    }

    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        this.setBackground(Color.BLACK);

        ClassLoader loader = MyPanel.class.getClassLoader();
        ImageIcon cubey = new ImageIcon(loader.getResource("CubeyPac/cube.gif"));
        cubey.paintIcon(this, g, 70, 70);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        seconds++;
        System.out.println(seconds);
    }
}
