package Ejercicios_Udemy;

public class ConversiDeTipos {

    public static void main(String[] args) {


        String numeroStr1 = "50";
        int numeroInt = Integer.parseInt(numeroStr1);
        System.out.println("numeroInt: " + numeroInt);

        String numroStr2 = "78.9";
        double numroDouble = Double.parseDouble(numroStr2);
        System.out.println("numroDouble: " + numroDouble);

        String numroStr3 = "true";
        boolean numroBool = Boolean.parseBoolean(numroStr3);
        System.out.println("numroBool: " + numroBool);

    }

}
