import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int a;
        int b;

        System.out.println("Input first number ");
        a = reader.nextInt();

        System.out.println("Input second number ");
        b = reader.nextInt();

        System.out.println(a == b);
        System.out.println(a < b);
        System.out.println(a <= b);
        System.out.println(a > b);
        System.out.println(a >= b);
    }
}