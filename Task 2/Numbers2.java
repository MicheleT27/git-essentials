import java.util.Scanner;

public class Numbers2 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int a;
        int b;

        System.out.println("Input first number ");
        a = reader.nextInt();

        System.out.println("Input second number ");
        b = reader.nextInt();

        if((a == b) || (a < 0 && b > 0) || (a > 100 && b > 100))
            System.out.println(true);
        else
            System.out.println(false);
    }
}
