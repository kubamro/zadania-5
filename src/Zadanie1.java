import java.util.Arrays;

public class Zadanie1 {
    public static void main(String[] args) {

        String[] names = new String[3];

        names[0] = "Adam";
        names[1] = "Jacek";
        names[2] = "Piotr";

        String arrayString = Arrays.toString(names);

        System.out.println(arrayString);
    }
}
