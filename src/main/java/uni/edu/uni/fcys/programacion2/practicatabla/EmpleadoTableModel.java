/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uni.edu.uni.fcys.programacion2.practicatabla;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Sistemas-12
 */
public class EmpleadoTableModel extends AbstractTableModel{

    private List<EmpleadoSubModel> empleados;
    private String [ ]Header = new String[]{
      "ID","Nombre","Apellido","Ocupacion","Cargo","Salario"  
    };

    
    public EmpleadoTableModel() {
        this.empleados = new ArrayList<>();
    }

    public EmpleadoTableModel(List<EmpleadoSubModel> empleados) {
        this.empleados = empleados;
    }
    
    @Override
    public int getRowCount() {
        return empleados.size();
    }

    @Override
    public int getColumnCount() {
       return Header.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return empleados.isEmpty()? null:empleados.get(rowIndex).asArry()[columnIndex];
    }
    public void add(EmpleadoSubModel empleadoSubModel){
        empleados.add(empleadoSubModel);
        fireTableDataChanged();
    }
    public String getColumnName(int index){
        return Header[index];
        
    }
}
