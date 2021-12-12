package io.github.xjrga.foods;

/**
 * Delivers Welcome to Snackmix Food Library Message
 *
 */
public class Main {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("-------------------------------------------------------------------");
        sb.append("\n");
        sb.append("Welcome to the Snackmix Food Library");
        sb.append("\n\n");
        sb.append("Snackmix Food Library uses a data subset from:\n"
                + "USDA National Nutrient Database for Standard Reference, Release 28"
                + "\n");
        sb.append("\n");
        sb.append("It would be great to see foods from all over world here.");
        sb.append("\n");
        sb.append("-------------------------------------------------------------------");
        System.out.println(sb.toString());
    }
}
