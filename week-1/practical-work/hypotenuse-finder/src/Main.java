import java.util.Scanner;

// Kendi yazdıgım kod
/* public class Main {
    public static void main(String[] args)
    {
        double a,b;

        Scanner inp = new Scanner(System.in);
        System.out.print("A kenarını girin : ");
        a = inp.nextDouble();
        System.out.print("B kenarını girin : ");
        b = inp.nextDouble();

        double c = (a*a) + (b*b);

        System.out.println("C Kenarı : " + c);



    }
}*/

// Eğitim kodu

public class Main {
    public static void main(String[] args)
    {
        double a,b,c;


        Scanner inp = new Scanner(System.in);
        System.out.print("1. kenarını girin : ");
        a = inp.nextDouble();
        System.out.print("2. kenarını girin : ");
        b = inp.nextDouble();

         c = Math.sqrt((a*a) + (b*b));

        System.out.println("Hipotenüs : " + c);



    }
}