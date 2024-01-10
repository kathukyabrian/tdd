package tech.kitucode.tdd;

public class StringSwapHelper {

    /**
     * takes in a string and swaps last 2 characters
     *
     * @param string
     * @return
     */
    public static String swapStrings(String string) {
        string = string.trim();
        if (string.isEmpty()) {
            return null;
        }

        if (string.length() == 1) {
            return string;
        }

        // this means that string length is greater than 1 hence can be swapped
        // get last 2 characters and swap them
        int length = string.length();
        char lastChar = string.charAt(length - 1);
        char secondLastChar = string.charAt(length - 2);

        StringBuilder stringBuilder = new StringBuilder(string);
        stringBuilder.setCharAt(length - 1, secondLastChar);
        stringBuilder.setCharAt(length - 2, lastChar);

        return stringBuilder.toString();
    }
}
