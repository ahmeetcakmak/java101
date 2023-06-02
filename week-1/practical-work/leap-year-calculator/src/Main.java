import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int year,leapYear;

        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen Bir Yıl Giriniz : ");
         year = inp.nextInt();

        if((year % 400 == 0) && year %100 == 0){
             System.out.println(year + " Bir Artık Yıldır !");
         }else if((year % 4 == 0) && (year % 100 != 0) ){
            System.out.println(year + " Bir Artık Yıldır !");
         }else {
            System.out.println(year + " Bir Artık Yıl Değildir !");
        }

    }
}