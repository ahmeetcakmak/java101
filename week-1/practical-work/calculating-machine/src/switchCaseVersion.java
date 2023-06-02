import java.util.Scanner;

public class switchCaseVersion {
    public static void main(String[] args) {
        int a1,b2,select;

        Scanner inp = new Scanner(System.in);
        System.out.print("1. Sayıyı giriniz : ");
        a1 = inp.nextInt();
        System.out.print("2. Sayıyı Giriniz : ");
        b2 = inp.nextInt();


        System.out.println("1- toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz : ");
        select = inp.nextInt();

    if (b2 == 0 && (select == 4) || (select >= 5)){
        System.out.println("Hatalı İşlem");
    } else  {
        switch (select) {
            case 1:
                System.out.println("Sonuç : " + (a1 + b2));
                break;
            case 2:

                System.out.println("Sonuç : " + (a1 - b2));

                break;

            case 3:
                System.out.println("Sonuç : " + (a1 * b2));
                break;

            case 4: System.out.println("Sonuç : " + (a1 / b2));

        }
    }


        }
    }

