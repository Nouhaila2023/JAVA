package Tema2.Prueva;

public class CubitusHumerus2 {

    public static int numero_aleatorio(int min , int max){

        return (int)(Math.random()*(max-min+1) +min);

    }

    public static void main(String[] args) {

        //Nuestros dos romanos favoritos juegan a los dados
        //Cada uno tira dos dados
        //Gana aquel de los dos cuya suma de sus dados sea mayor, o
        //aquel cuyos dos dados sean iguales
        //Juega 20 rondas y dime quién gana


        int contadorH = 0;
        int contadorG = 0;

        int TCubitus1, TCubitus2;
        int THumerus1, THumerus2;


        for (int i = 1; i <= 10; i++) {

                TCubitus1 = numero_aleatorio(1, 20);
                THumerus1 = numero_aleatorio(1, 20);
                TCubitus2 = numero_aleatorio(1, 20);
                THumerus2 = numero_aleatorio(1, 20);

                System.out.println("La tirada del Cubitus \ndado1: " + TCubitus1 + "  dado2: " + TCubitus2);
                System.out.println("La tirada del Humerus \ndado1: " + THumerus1 + "  dado2: " + THumerus2);

                int suma1 = THumerus1 + THumerus2;
                int suma2 = TCubitus2 + TCubitus1;

                if (suma2 > suma1) {
                    System.out.println("Gana el Cubitus ");
                    contadorG++;
                } else if (suma2 == suma1) {
                    System.out.println("Empate");
                } else {
                    System.out.println("Gana el Humerus ");
                    contadorH++;
                }

            System.out.println("-------------------------------------------------------------");

        }

        System.out.println("Total victorias Cubitus: " + contadorG);
        System.out.println("Total victorias Humerus: " + contadorH);

        if (contadorG > contadorH) {
            System.out.println("Gana El Cubitus");
        } else if (contadorH > contadorG) {
            System.out.println("Gana El Humerus");
        } else {
            System.out.println("La Partida Es Empate");
        }
    }
}
