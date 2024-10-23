package Tema2.EjerciciosRepaso;

/* Escribe un programa que lea un número N e imprima una pirámide de números con N filas como en la
siguiente figura:
    1
   121
  12321
 1234321

*/

public class Ejercicio17 {
    public static void main(String[] args) {


        for (int i = 4; i >= 1 ; i--) {

            for (int j = 1; j <= 4 ; j++) {

                System.out.println("*");

            }

            System.out.println();

        }


    }
}
