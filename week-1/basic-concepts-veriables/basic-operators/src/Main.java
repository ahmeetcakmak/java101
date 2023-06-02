
public class Main {
    public static void main(String[] args) {

        int a = 5, b=8,c=25;

        boolean kosul1 = a == c;
        boolean kosul2 = a >= b;

        //boolean result = kosul1&&kosul2;
        boolean result = kosul1 || kosul2;

       // boolean result = ((a == c) || (a >= b));

        String str = result ? "True" : "False";


        System.out.println(str);

    }
}