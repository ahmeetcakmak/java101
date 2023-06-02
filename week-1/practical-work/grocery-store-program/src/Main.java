import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      double pear, apple ,tomato, banana, eggplant,total;

        Scanner inp = new Scanner(System.in);
        System.out.print("How many kilograms a pear : ");
        pear = inp.nextDouble();

        System.out.print("How many kilograms a apple : ");
        apple = inp.nextDouble();

        System.out.print("How many kilograms a tomato : ");
        tomato = inp.nextDouble();

        System.out.print("How many kilograms a banana : ");
        banana = inp.nextDouble();

        System.out.print("How many kilograms a eggplant : ");
        eggplant = inp.nextDouble();

        pear *=  2.14;
        apple *= 3.67;
        tomato *=  1.11;
        banana *= 0.95;
        eggplant *= 5;

    total = pear+apple+tomato+banana+eggplant;

        System.out.println("Total amount : "+total);

    }
}