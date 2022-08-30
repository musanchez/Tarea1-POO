/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a1e1;

public class Trabajador {
    private String codigo;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private double salario_mensual;

    public Trabajador(String codigo, String nombre, String apellido1, String apellido2, double salario_mensual) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.salario_mensual = salario_mensual;
    }
    
    public double salario_diario(){
        return salario_mensual/30;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public double getSalario_mensual() {
        return salario_mensual;
    }

    public void setSalario_mensual(double salario_mensual) {
        this.salario_mensual = salario_mensual;
    }
    
}
