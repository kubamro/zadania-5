import java.util.Scanner;

public class Zadanie7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Podaj 5 imion:");

        String name1 = input.next();
        String name2 = input.next();
        String name3 = input.next();
        String name4 = input.next();
        String name5 = input.next();

        System.out.printf("\n%s %s\n%s %s\n%s %s\n%s %s\n%s %s\n","Cześć",name5,"Cześć",name4,"Cześć",name3,"Cześć",name2,"Cześć",name1);

    }
}
