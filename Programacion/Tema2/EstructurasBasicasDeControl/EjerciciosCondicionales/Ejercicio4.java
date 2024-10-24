package Tema2.EstructurasBasicasDeControl.EjerciciosCondicionales;

   /*Crea una función que no devuelva nada (void) que, dado un importe en euros, nos indique el mínimo
número de billetes y la cantidad sobrante que se pueden utilizar para obtener dicha cantidad. Ejemplo:
362 euros  1 billete de 200, 1 billete de 100, 1 billete 50, un billete de 10, sobran 2 euros. Pista: hay
que ir sacando la división entera, y el resto se lleva al siguiente billete. */

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        int b200 , b100 , b50 , b10;
        int cantidad200 = 0;
        int cantidad100 = 0;
        int cantidad50 = 0;
        int cantidad10 = 0;

        Scanner sc = new Scanner(System.in);
        int cantidad;
        System.out.println("Ingrese cantidad de billetes");
        cantidad = sc.nextInt();

        if (cantidad >= 200){
            b200 = cantidad / 200;
            System.out.println("Hay *" + b200 + "* billetes de 200€.");

            cantidad -= (200*b200);
            cantidad200 = cantidad;

        }


        if (cantidad200 >= 100 || cantidad >= 100){
            b100 = cantidad200 / 100;
            System.out.println("Hay *" + b100 + "* billetes de 100€.");

            cantidad200 -= (100*b100);
            cantidad100 = cantidad200;

        }


        if (cantidad100 >= 50){
            b50 = cantidad100 / 50;
            System.out.println("Hay *" + b50 + "* billetes de 50€.");

            cantidad100 -= (50*b50);
            cantidad50 = cantidad100;

        }


        if (cantidad50 >= 10){
            b10 = cantidad50 / 10;
            System.out.println("Hay *" + b10 + "* billetes de 10€.");

            cantidad50 -= (10*b10);
            cantidad10 = cantidad50;

            System.out.println( "Sobran " + cantidad10 + "€");

        }





    }
}
