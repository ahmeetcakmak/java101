import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double kg,m,index;

        Scanner inp = new Scanner(System.in);
        System.out.print("Please enter your height (in meters) : ");
        m = inp.nextDouble();
        System.out.print("Please enter your weight : ");
        kg = inp.nextDouble();

        index = kg / (m * m);

        System.out.println("Your body mass index : " + index);

    }
}