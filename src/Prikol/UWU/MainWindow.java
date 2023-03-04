package Prikol.UWU;

import Prikol.MyTableModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainWindow extends JFrame {
    private JTable jTable;
    public MainWindow(){
        super("Gay List");

        jTable = new JTable();
        jTable.setModel(new MyTableModel());
        this.add(jTable);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);



    }
}


