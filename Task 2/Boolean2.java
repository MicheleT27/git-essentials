import java.util.Scanner;

public class Boolean2 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        boolean b1;

        System.out.println("Input value ");
        b1 = reader.nextBoolean();

        if(b1 == true)
            System.out.println("Opposite of true is false");
        else
            System.out.println("Opposite of false is true");
    }
}
