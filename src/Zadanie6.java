import java.util.Scanner;

public class Zadanie6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Podaj liczbę z przedziału 100-200. Liczba musi być podzielna przez 3.");

        int number = input.nextInt();


        while(number%3==0)
        {if (number>200)
            System.out.println("liczba jest za duża"+'\n'+"Podaj liczbę");
            number = input.nextInt();

            if(number<100){
            System.out.println("liczba jest za mała"+'\n'+"Podaj liczbę");
            number = input.nextInt();
        }
         else if(number%3==0){
            System.out.println("liczba jest ok");
            input.close();
        }



    }
}}