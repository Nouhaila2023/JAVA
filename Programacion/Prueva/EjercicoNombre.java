package Prueva;

import java.util.Scanner;
//Ejercicio de clase
//crea un programa que pida por teclado tu nombre y tus apellidos por separado
//Tienes que mostrar poer pantalla , primero los apellidos luego una como y luego tu nombre


public class EjercicoNombre {
    public static void main(String[] args) {

    String nombre;
    String primerApellido;
    String segundoApellido;

    Scanner sc = new Scanner(System.in);

    System.out.println("Cual es tu nombre: ");
    nombre = sc.nextLine();
    System.out.println("Cual es tu primer apellido: ");
    primerApellido = sc.nextLine();
    System.out.println("Cual es tu segundo apellido: ");
    segundoApellido = sc.nextLine();

    System.out.println("El nombre completo es: " + primerApellido + " " + segundoApellido + ", " + nombre );

    sc.close();

    }
}
