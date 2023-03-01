package Prikol;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainWindow extends JFrame {
    private JButton but1;
    private JButton but2;
    private JButton but3;
    private JButton but4;
    private JButton but5;
    public MainWindow(){
        setTitle("Hello World!!!");

        //setSize(200, 200);

        but1 = new JButton("Click me");
        but2 = new JButton("Don't touch me!");
        but3 = new JButton("NOOOO!!!");
        but4 = new JButton("Yes!");
        but5 = new JButton("Yes!");

        but1.addActionListener(e ->
                System.out.println("Click!")

        );
        but2.addActionListener(e -> System.out.println("Why?"));
        but3.setEnabled(false);

        add(but1, BorderLayout.NORTH);
        add(but2, BorderLayout.SOUTH);
        add(but3, BorderLayout.EAST);
        JPanel centerPanel = new JPanel();
        centerPanel.add(but4);
        centerPanel.add(but5);
        add(centerPanel);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        setLocationByPlatform(true);
        pack();

        setVisible(true);



    }
}


