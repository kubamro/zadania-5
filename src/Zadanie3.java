public class Zadanie3 {
    public static void main(String[] args) {

        double i = 0;


        while (i <= 3.1){
            System.out.printf("%.1f, ",i);
            i = i +0.1;


        }

        System.out.println("");

        double o = 0;
        do {
            System.out.printf("%.1f, ",o);
            o = o+0.1;
        } while (o < 3.1);
    }
}
