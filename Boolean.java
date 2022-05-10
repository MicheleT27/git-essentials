import java.util.Scanner;

public class Boolean {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        boolean b1;
        boolean b2;

        System.out.println("Input first value ");
        b1 = reader.nextBoolean();

        System.out.println("Input second value ");
        b2 = reader.nextBoolean();

        System.out.println(b1 == b2);
    }
}
