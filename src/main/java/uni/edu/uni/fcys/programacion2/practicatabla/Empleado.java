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
public class Empleado {
   private int id;
   private String nombres;
   private String apellidos;
   private String direccion;
   private String telefono ;
   private String correo;
   private String cedula;
   private String ocupacion;
   private String cargo;
   private double salario;

    public Empleado(int id, String nombres, String apellidos, String direccion, String telefono, String correo, String cedula, String ocupacion, String cargo, double salario) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
        this.cedula = cedula;
        this.ocupacion = ocupacion;
        this.cargo = cargo;
        this.salario = salario;
    }

    public Empleado() {
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
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
        Object []emp = new Object[10];
        emp[0]= id;
        emp[1]= nombres;
        emp[2]= apellidos;
        emp[3]= direccion;
        emp[4]= telefono;
        emp[5]= correo;
        emp[6]= cedula;
        emp[7]= ocupacion;
        emp[8]= cargo;
        emp[9]= salario;
       return emp;
       
    }
}
