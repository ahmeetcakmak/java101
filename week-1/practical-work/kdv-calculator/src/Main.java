// Kendi yazdığım kod
/*
public class Main {
    public static void main(String[] args) {

        double urun = 100;
        double kdv = 0.18;
        double kdvTutari = urun*kdv;
        double kdvFiyat = urun + kdvTutari;


        System.out.println("KDV'siz Fiyat : " + urun);
        System.out.println("KDV'li Fiyat : " + kdvFiyat);
        System.out.println("KDV Tutarı : " + kdvTutari);
        System.out.println("KDV Oranı : " + kdv);

    }
}*/

//Eğitim kodu

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double tutar,kdvOran = 0.18,kdvTutar,kdvliTutar;

        Scanner input = new Scanner(System.in);
        System.out.print("Ücret Tutarını Giriniz : ");
        tutar = input.nextDouble();

        kdvTutar = tutar * kdvOran;
        kdvliTutar = tutar + kdvTutar;

        System.out.println("KDV'siz Fiyat : " + tutar);
        System.out.println("KDV'li Fiyat : " + kdvliTutar);
        System.out.println("KDV Tutarı : " + kdvTutar);
        System.out.println("KDV Oranı : " + kdvOran);
    }
}

