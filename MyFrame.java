package CubeyPac;

import javax.swing.*;

public class MyFrame extends JFrame {

    MyPanel myPanel = new MyPanel();

    public MyFrame() {

        this.setSize(420,420);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(myPanel);
        this.setVisible(true);
    }
}
