import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1,n2,select;

        Scanner inp = new Scanner(System.in);
        System.out.print("İlk Sayıyı Giriniz : ");
        n1 = inp.nextInt();
        System.out.print("İkinci Sayıyı giriniz : ");
        n2 = inp.nextInt();

        System.out.println("1- toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz : ");
        select = inp.nextInt();

        if (select==1) {
            System.out.println("Sonuç : " + (n1 + n2));
        } else if (select == 2) {
            System.out.println("Sonuç : " + (n1 - n2));
        }else if (select == 3) {
            System.out.println("Sonuç : " + (n1 * n2));
        }else if (select == 4) {
            if (n2 != 0){
                System.out.println("Sonuç : " + (n1 / n2));
            }else {
                System.out.println("Bir sayı 0'a bölünemez !");
            }

        }else {
            System.out.println("Geçersiz bir seçim yaptınız ! ");
        }


    }
}