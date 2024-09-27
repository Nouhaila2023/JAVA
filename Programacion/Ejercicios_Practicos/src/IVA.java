import java.util.Scanner;

public class IVA {
    public static void main(String[] args) {

        double precio1 = 0;
        double iva1 = 0.2;
        double precioconvia1 ;

        System.out.println("El precio: ");

        Scanner sc = new Scanner(System.in);
        precio1 = sc.nextDouble();

        precioconvia1 = precio1 * (1 + iva1);

        System.out.println("El precio1 del preoducto con el IVA es: " + precioconvia1 + "€");


        //Otra manera

        double precio2 = 0;
        double iva2 = 0.2;
        double precioconvia2 ;

        System.out.println("El precio es de: ");

        precio2 = sc.nextDouble();

        precioconvia2 = precio2 + (precio2 * iva1);

        System.out.println("El precio2 del preoducto con el IVA es: " + precioconvia2 + "€");


    }
}
