package Prikol.UWU;

import Prikol.MyTableModel;
import Prikol.data.University;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainWindow extends JFrame {
    private JTable jTable;
    private  MyTableModel myTableModel;
    private JButton jButton;
    public MainWindow(){
        super("Gay List");
        myTableModel = new MyTableModel(new University());

        jTable = new JTable();
        jTable.setModel(new MyTableModel(new University()));
        JScrollPane jScrollPane = new JScrollPane(jTable);
        this.add(jScrollPane);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);



    }
}


