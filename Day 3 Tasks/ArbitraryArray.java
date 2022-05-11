import java.util.Arrays;

public class ArbitraryArray {
    public static void main(String[] args) {

        int arbitraryNumber[] = {3, 5, 7, 9};
        int new_arbitraryNumber[] = new int[4];

        System.out.println("Arbitrary Array : " + Arrays.toString(arbitraryNumber));

        for(int i=0; i < arbitraryNumber.length; i++) {
            new_arbitraryNumber[i] = arbitraryNumber[i];
        }
        System.out.println("New Arbitrary Array: "+Arrays.toString(new_arbitraryNumber));
    }

}
