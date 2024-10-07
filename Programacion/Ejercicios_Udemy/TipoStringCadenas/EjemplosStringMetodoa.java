package Ejercicios_Udemy.TipoStringCadenas;

public class EjemplosStringMetodoa {

    public static void main(String[] args) {

        String nombre = "Nouhaila";

        System.out.println("Metodo length: " + nombre.length());
        System.out.println("Metodo toUpperCase: " + nombre.toUpperCase());
        System.out.println("Metodo toLowerCase: " + nombre.toLowerCase());
        System.out.println("Metodo equals (\"Nouhaila\"): " + nombre.equals("Nouhaila"));
        System.out.println("Metodo equals (\"NOUHAILA\"): " + nombre.equals("NOUHAILA"));
        System.out.println("Metodo equalsIgnoreCase (\"NOUHAIL\"): " + nombre.equalsIgnoreCase("NOUHAILA"));
        System.out.println("Metodo compareTo: " + nombre.compareTo("Nouhaila"));
        System.out.println("Metodo comparTo Con otro nombre: " + nombre.compareTo("Ale"));
        System.out.println("Metodo charAt: " +nombre.charAt(0));
        System.out.println("Metodo charAt: " +nombre.charAt(1));
        System.out.println("Metodo charAt: " +nombre.charAt(2));
        System.out.println("Metodo charAt: " +nombre.charAt(3));
        System.out.println("Metodo charAt: " +nombre.charAt(4));
        System.out.println("Metodo charAt: " +nombre.charAt(5));
        System.out.println("Metodo charAt: " +nombre.charAt(6));
        System.out.println("Metodo charAt: " +nombre.charAt(7));
        System.out.println("Metodo charAt(nombre.length()): " + nombre.charAt(nombre.length()-1));




    }

}
