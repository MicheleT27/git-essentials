import java.util.Arrays;

public class Array {
    public static void main(String[] args) {

        int MultiplicationTable[][] = new int[10][10];

        for (int row = 0; row < 10; row++) {
            for (int col = 0; col < 10; col++) {
                MultiplicationTable[row][col] = (row + 1) * (col + 1);
            }
        }

        System.out.printf("%6s", "");
        for (int col = 0; col < MultiplicationTable[0].length; col++) {
            System.out.printf("%6d", col + 1);
        }
        System.out.println();

        for (int row = 0; row < MultiplicationTable.length; row++) {
            System.out.printf("%6d", row + 1);

            for (int col = 0; col < MultiplicationTable[row].length; col++) {
                System.out.printf("%6d", MultiplicationTable[row][col]);
            }
            System.out.println();
        }

    }
}
