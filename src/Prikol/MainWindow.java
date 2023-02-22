package Prikol;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame {
    public MainWindow(){
        setTitle("Hello World!!!");

        //setSize(200, 200);

        JButton but1 = new JButton("Click me");
        but1.addActionListener(new MyListener());
        add(but1);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        setLocationByPlatform(true);
        pack();

        setVisible(true);

    }
}

class MyListener implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Click");
    }
}
