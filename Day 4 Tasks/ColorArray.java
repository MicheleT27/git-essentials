import java.util.*;

public class ColorArray {
    public static void main(String[] args) {

        String colorArray[] = {"grey", "white", "red", "green", "blue", "orange", "pink"};
        List<String> colors = new ArrayList<>(Arrays.asList(colorArray));

        System.out.println("Original List:\n" + colors);

        colors.remove(2);
        colors.add("violet");
        colors.add(0,"black");

        System.out.println("List after adding and removing:");
        colors.forEach(color -> {
            System.out.println(color);
        });

        List<String> colorsSublist = new ArrayList<>(colors.subList(2,5));
        System.out.println("Colors of colorsSublist:");
        for(int i = 0; i < colorsSublist.size(); i++) {
            System.out.println(colorsSublist.get(i));
        }

    }

}
