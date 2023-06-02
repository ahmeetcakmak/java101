import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int r;
        double pi = 3.14;

        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the radius of the circle : ");
        r = inp.nextInt();

        double area = pi * r *r;
        double perimeter = 2 * pi * r;

        System.out.println("Area of the circle : " + area);
        System.out.println("Perimeter of the circle : " + perimeter);


    }
}