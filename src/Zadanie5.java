public class Zadanie5 {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;
        for (i=0; i<101; i++){
            if (i % 2 ==0){
                System.out.println(i);
                sum = i + sum;
            }
        }
        System.out.printf("Suma liczba parzystych od 0 do 100 wynosi: "+sum);
    }
}
