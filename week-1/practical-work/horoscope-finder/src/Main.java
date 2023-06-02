import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int month, day;
        String burc = "";
        boolean isError = false;

        Scanner inp = new Scanner(System.in);

        System.out.print("Doğduğunuz ay: ");
        month = inp.nextInt();

        System.out.print("Doğduğunuz gün: ");
        day = inp.nextInt();

        if (day >= 1 && day <= 31 && month >= 1 && month <= 12) {
            if (month == 1) {
                if (day <= 20) {
                    burc = "Oğlak";
                } else {
                    burc = "Kova";
                }
            } else if (month == 2) {
                if (day <= 29) {
                    burc = "Kova";
                } else {
                    isError = true;
                }
            } else if (month == 3) {
                if (day <= 20) {
                    burc = "Balık";
                } else {
                    burc = "Koç";
                }
            } else if (month == 4) {
                if (day <= 30) {
                    burc = "Koç";
                } else {
                    isError = true;
                }
            } else if (month == 5) {
                if (day <= 21) {
                    burc = "Boğa";
                } else {
                    burc = "İkizler";
                }
            } else if (month == 6) {
                if (day <= 30) {
                    burc = "İkizler";
                } else {
                    isError = true;
                }
            } else if (month == 7) {
                if (day <= 22) {
                    burc = "Yengeç";
                } else {
                    burc = "Aslan";
                }
            } else if (month == 8) {
                if (day <= 23) {
                    burc = "Aslan";
                } else {
                    burc = "Başak";
                }
            } else if (month == 9) {
                if (day <= 30) {
                    burc = "Başak";
                } else {
                    isError = true;
                }
            } else if (month == 10) {
                if (day <= 23) {
                    burc = "Terazi";
                } else {
                    burc = "Akrep";
                }
            } else if (month == 11) {
                if (day <= 30) {
                    burc = "Akrep";
                } else {
                    isError = true;
                }
            } else if (month == 12) {
                if (day <= 21) {
                    burc = "Yay";
                } else {
                    burc = "Oğlak";
                }
            }
        } else {
            isError = true;
        }

        if (isError) {
            System.out.println("Hatalı Gün veya Ay Girdiniz");
        } else {
            System.out.println("Burcunuz: " + burc);
        }
    }
}
