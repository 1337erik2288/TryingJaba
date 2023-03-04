package Prikol;

import Prikol.data.Person;
import Prikol.data.Student;
import Prikol.data.Teacher;
import Prikol.data.University;

import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

public class MyTableModel extends AbstractTableModel {
    private University data;
    public MyTableModel(University university){
        this.data = university;
    }
    @Override
    public int getRowCount() {
        return data.getCount();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex){
            case 0: return data.getPerson(rowIndex).getFio();
            case 1: {
                    Person p = data.getPerson(rowIndex);
                    if (p instanceof Student){
                        return ((Student) p).getGroup();
                    }else{
                        return ((Teacher) p).getSubject();
                    }


            }
        }
        return "AAAAAAAAAAAA";
    }
}
