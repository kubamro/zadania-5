import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Podaj X");
        int x = input.nextInt();

        System.out.println("Podaj Y");
        int y = input.nextInt();


        if (x>0 && y>0){
            System.out.println("Punkt"+"("+x+","+y+") leży w I ćwiartce układu współrzędnych");

        } else if(x>0 && y<0){
            System.out.println("Punkt"+"("+x+","+y+") leży w IV ćwiartce układu współrzędnych");

        } else if(x<0 && y<0){
            System.out.println("Punkt"+"("+x+","+y+") leży w III ćwiartce układu współrzędnych");

        } else if (x<0 && y>0){
            System.out.println("Punkt"+"("+x+","+y+") leży w II ćwiartce układu współrzędnych");

        }
    }
}
