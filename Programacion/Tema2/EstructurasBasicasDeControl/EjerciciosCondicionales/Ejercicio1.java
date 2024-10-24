package Tema2.EstructurasBasicasDeControl.EjerciciosCondicionales;

import java.util.Scanner;

public class Ejercicio1 {

    /*Crea una función (método) que reciba como parámetros tres números enteros y devuelva el mayor de
los tres números. Utilizar esa función para el calcular el mayor de cuatro números enteros. Sería así:
public int mayor (int a, int b, int c) { … }
*/

    public static int Mayor(int a, int b, int c){

        if (a>b && a>c){
            return a;
        } else if (b>a && b>c ) {
            return b;
        }else {
            return c;
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Intriga el valor de A:");
        int a = sc.nextInt();
        System.out.println("Intriga el valor de B:");
        int b = sc.nextInt();
        System.out.println("Intriga el valor de C:");
        int c = sc.nextInt();
        System.out.println("Intrega el valoe de D:");
        int d = sc.nextInt();


        int resultado = Mayor(a,b,c);
        System.out.println("El mayor numero es: " + resultado);


        if (d > Mayor(a,b,c)){
            System.out.println("El mayor numero es: " + d );
        }

    }
}
