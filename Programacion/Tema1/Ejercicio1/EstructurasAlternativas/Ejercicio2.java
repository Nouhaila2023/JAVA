package Tema1.Ejercicio1.EstructurasAlternativas;

import java.util.Scanner;

/**Escribe un programa que lea un número e indique si es par o impar. **/
public class Ejercicio2 {
    public static void main(String[] args) {

        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("El numero " + num + " es par");
        }else {
            System.out.println("El numero " + num + " es impar");
        }

        sc.close();


    }
}