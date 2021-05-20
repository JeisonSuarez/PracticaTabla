/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uni.edu.uni.fcys.programacion2.practicatabla;

/**
 *
 * @author Sistemas-12
 */
public class EmpleadoSubModel {
    private int id ;
    private String nombres;
    private String apellidos;
    private String ocupacion;
    private String cargo;
    private double salario;

    public EmpleadoSubModel() {
    }

    public EmpleadoSubModel(int id, String nombres, String apellidos, String ocupacion, String cargo, double salario) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.ocupacion = ocupacion;
        this.cargo = cargo;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
     public Object [] asArry (){
        Object []empleado = new Object[10];
        empleado[0]= id;
        empleado[1]= nombres;
        empleado[2]= apellidos;
        empleado[3]= ocupacion;
        empleado[4]= cargo;
        empleado[5]= salario;
       
       return empleado;
       
    }
    
}
