package Tema2.EstructurasBasicasDeControl.EjercicioBucle;

/*Programa que pida al usuario un número repetidamente hasta que esté entre 1 y 10.*/

import java.util.Scanner;

public class Ejercicio5 {

    public static void Numero(int numero){

        while (numero < 1 && numero > 10){


        }


    }


    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);
        System.out.println("Intrega el numero:");
        int numero = Integer.parseInt(sc.nextLine());

        Numero(numero);






    }
}
