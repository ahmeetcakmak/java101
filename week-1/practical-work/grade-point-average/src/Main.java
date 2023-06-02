import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Degiskenleri olusturma
        int mat,fzk,kmy,trkc,trh,mzk;

        Scanner inp = new Scanner(System.in);

        // Kullanıcıdan degeri al
        System.out.print("Matematik Notunuz : ");
        mat = inp.nextInt();

        System.out.print("Fizik Notunuz : ");
        fzk = inp.nextInt();

        System.out.print("Kimya Notunuz : ");
        kmy = inp.nextInt();

        System.out.print("Turkce Notunuz : ");
        trkc = inp.nextInt();

        System.out.print("Tarih Notunuz : ");
        trh = inp.nextInt();

        System.out.print("Muzik Notunuz : ");
        mzk = inp.nextInt();

        int toplam = (mat+fzk+kmy+trkc+trh+mzk);
       // double sonuc = toplam/6.0;

        boolean kosul1 = toplam/6 >= 50;
        boolean kosul2 = toplam/6 < 50;

        boolean sonuc = kosul1;

        String str = sonuc ? "Geçtiniz" : "Kaldınız";


        System.out.println("Ortalamanız : " + +toplam/6 +" " +  str);



    }
}