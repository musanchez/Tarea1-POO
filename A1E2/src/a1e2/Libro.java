/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a1e2;

/**
 *
 * @author User
 */
public class Libro {
    String nombre, autor, descripcion;
    int id;
    double precio;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Libro(String nombre, String autor, String descripcion, int id, double precio) {
        this.nombre = nombre;
        this.autor = autor;
        this.descripcion = descripcion;
        this.id = id;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "ID: "+ id + " - Libro: " + nombre + " - Autor: " + autor + "\n" + "Descripcion: " + descripcion + " - Precio: " + precio + "\n\n";
    }
    
}
