/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a1e1;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class A1E1 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner pedir = new Scanner(System.in);
        String cod, nom, ap1, ap2;
        double sal;
        System.out.println("Ingresa el codigo del trabajador: ");
        cod = pedir.nextLine();
        System.out.println("Nombre: ");
        nom = pedir.nextLine();
        System.out.println("Primer apellido: ");
        ap1 = pedir.nextLine();
        System.out.println("Segundo apellido: ");
        ap2 = pedir.nextLine();
        System.out.println("Salario mensual en $: ");
        sal = pedir.nextDouble();
        while (sal <= 0) {
            System.out.println("El salario debe ser positivo");
            System.out.println("Salario mensual en $: ");
            sal = pedir.nextDouble();
        }
        
        Trabajador trab = new Trabajador(cod, nom, ap1, ap2, sal);
        
        System.out.println("El salario diario del trabajador es $" + trab.salario_diario());
    }
    
}
