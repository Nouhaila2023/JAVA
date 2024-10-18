package Tema2.EjerciciosRepaso;

import java.util.Random;
import java.util.RandomAccess;

public class Ejercicio7 {


    public static void main(String[] args) {

        /*Piedra-papel-tijera. Realiza un programa que genere una tirada simulando piedra-papel-tijera. Haz otra
        tirada para otro jugador y di quién de los dos gana. Mejora el programa para que indique el número de
        partidas a jugar y al final indica cuántas partidas ha ganado cada uno.*/

        String[] opcion = {"piedra", "papel", "tijera"};

        Random random = new Random();

        int elejer1 = random.nextInt(3);
        String elejerJugador = opcion[elejer1];
        System.out.println(elejerJugador);

        int elejer2 = random.nextInt(3);
        String elejerJugador2 = opcion[elejer2];
        System.out.println(elejerJugador2);


        /*if (elejerJugador == "piedra" && elejerJugador == "papel" ){
            System.out.println("Gana piedra");
        }*/



    }
}
