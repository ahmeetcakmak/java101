import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int heat;

        Scanner inp = new Scanner(System.in);
        System.out.print("Sıcaklık Giriniz : ");
        heat = inp.nextInt();


        if (heat < 5) {
            System.out.print("Kayak Yapabilirsiniz.");

        } else if (heat <= 15 && heat >= 10) {
            System.out.print("Sinemaya veya pikniğe Gidebilirsiniz.");

        } else if (heat >= 5 && heat <= 15) {

            System.out.print("Sinemaya gidebilirsiniz.");

        } else if (heat <= 25 && heat >= 5) {
            System.out.print("Piknige Gidebilirsiniz");

        } else {
            System.out.print("Yüzmeye Gidebilirsiniz");
        }


    }
}