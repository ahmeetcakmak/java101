public class ifElseBlocks {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 123;

        if (a < b){
            if(a < c ){
                if(a==10){
                    System.out.println("A sayısı 10'dur");
                }
                System.out.println("A en küçük sayıdır");
            } else {
                System.out.println("A sayısı c den kucuktur");
            }
        }


       /*
        if ((a < b) && (a < c)){
            System.out.println("A en küçük sayıdır");
        }
        else if ((b < c) && (b < a)) {
            System.out.println("B en küçük sayıdır");
        }
        else if ((c < a) && (c < b)) {
            System.out.println("C en küçük sayıdır");
        }

        */




     /*
     boolean compare = a == b;
       //String str = compare ? "Eşittir" : "Eşit Degildir";
        //System.out.println(str);

        if (compare){
            a=50;
            System.out.println("A sayısı : " + a);
            System.out.println("Eşittir");
        }else {
            System.out.println("Eşit degildir");
        }
        System.out.println("Program Bitti");*/

    }
}
