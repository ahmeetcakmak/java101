import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password, repass, newpass, a;

        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız : ");
        userName = inp.nextLine();

        System.out.print("Şifremiz : ");
        password = inp.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.print("Giriş Yaptınız !");
        } else {
            System.out.print("Hatalı Giriş Şifrenizi Yenilemek İsterseniz 1'e atlamak için herhangi bir tuşa basın : ");
            repass = inp.nextLine();
            if (repass.equals("1")) {
                System.out.print("Yeni Şifre Oluşturun : ");
                newpass = inp.nextLine();
                if (newpass.equals("java123")) {
                    System.out.println("Şifre Oluşturulamadı Lütfen Tekrar Deneyiniz");
                } else {
                    System.out.println("Şifre Oluşturuldu");
                }

                ;
            }
        }
    }

}





