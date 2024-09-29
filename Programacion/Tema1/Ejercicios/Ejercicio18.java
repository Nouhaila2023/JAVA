package Tema1.Ejercicios;

public class Ejercicio18 {
    public static void main(String[] args) {

        int a = 10 , b = 3 , c = 1 ,d ,e;
        float x ,y;
        d = a + b++;
        e = ++a-b;
        y = (float)a / b;
        System.out.println("x= " + (x=a/b));
        System.out.println("c= " + (a<b && a<c));
        System.out.println("d= " + d);
        System.out.println("e= " + e);
        System.out.println("y= " + y);



    }
}
