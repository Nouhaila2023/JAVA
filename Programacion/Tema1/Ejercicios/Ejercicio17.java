package Tema1.Ejercicios;

public class Ejercicio17 {

    public static int numero_aleatorio(int min , int max){

        return (int)(Math.random()*(max-min+1) +min);

    }

    public static void main(String[] args) {

        //Escriba expresiones que almacenen en variables lo siguiente:

        //a. Crear un número entero positivo aleatorio entre 1 y 49.

        for (int i = 1; i <= 1; i++) {

            int numero = numero_aleatorio(1,49);

            System.out.println("a. " + numero);
        }

        //b. Generar un número aleatorio positivo par.

        int numero = numero_aleatorio(0,100);
        if (numero % 2 != 0){
            numero++;
        }
        System.out.println("b. " + numero);

        //c. Generar un número real aleatorio entre 1 y 10.

        for (int i = 1; i <= 1; i++) {

            int numero_c = numero_aleatorio(1,10);

            System.out.println("c. " + numero_c);
        }


        //d. Crear un número entero negativo entre -50 y -150.


        for (int i = 1; i <= 1; i++) {

            int numero_d = numero_aleatorio(-50,-150);

            System.out.println("d. " + numero_d);
        }

        //e. Crear un número entero entre -100 y 100.

        for (int i = 1; i <= 1; i++) {

            int numero_e = numero_aleatorio(-100,100);

            System.out.println("e. " + numero_e);
        }

        //f. Generar un número aleatorio que sea uno de los siguientes: 5, 7, 33, 125 o 77

        int numero_f = numero_aleatorio(5,125);

        if (numero_f == 5 || numero_f == 125 || numero_f == 33 || numero_f == 7) {



            System.out.println("f. " + numero_f);
        }


        //g. Crea un generador aleatorio de uno de los meses del año




    }
}