import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik;
        int toplamNot = 0;
        int notSayisi = 0;

        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik Notunuz: ");
        mat = inp.nextInt();
        switch (mat >= 0 && mat <= 100 ? 1 : 0) {
            case 1:
                toplamNot += mat;
                notSayisi++;
                break;
            default:
                break;
        }

        System.out.print("Fizik Notunuz: ");
        fizik = inp.nextInt();
        switch (fizik >= 0 && fizik <= 100 ? 1 : 0) {
            case 1:
                toplamNot += fizik;
                notSayisi++;
                break;
            default:
                break;
        }

        System.out.print("Turkce Notunuz: ");
        turkce = inp.nextInt();
        switch (turkce >= 0 && turkce <= 100 ? 1 : 0) {
            case 1:
                toplamNot += turkce;
                notSayisi++;
                break;
            default:
                break;
        }

        System.out.print("Kimya Notunuz: ");
        kimya = inp.nextInt();
        switch (kimya >= 0 && kimya <= 100 ? 1 : 0) {
            case 1:
                toplamNot += kimya;
                notSayisi++;
                break;
            default:
                break;
        }

        System.out.print("Muzik Notunuz: ");
        muzik = inp.nextInt();
        switch (muzik >= 0 && muzik <= 100 ? 1 : 0) {
            case 1:
                toplamNot += muzik;
                notSayisi++;
                break;
            default:
                break;
        }

        if (notSayisi > 0) {
            double ortalama = (double) toplamNot / notSayisi;
            System.out.println("Ortalamanız: " + ortalama);
        } else {
            System.out.println("Girilen notlar geçersizdir.");
        }
    }
}


//NOT : Bu ödevde yardım alınmıştır.
