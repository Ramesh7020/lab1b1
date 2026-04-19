package lab1b1;

import java.util.ArrayList;

public class ColorSearch {

    public static void main(String[] args) {

        // Create ArrayList
        ArrayList<String> colors = new ArrayList<>();

        // Add colors
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Red");
        colors.add("Black");

        // Display colors
        System.out.println("Colors List: " + colors);

        // Search for "Red"
        if (colors.contains("Red")) {
            System.out.println("Red color is available in the list.");
        } else {
            System.out.println("Red color is NOT available in the list.");
        }
    }
}