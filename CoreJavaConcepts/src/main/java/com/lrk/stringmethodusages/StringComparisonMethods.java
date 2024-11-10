package com.lrk.stringmethodusages;

public class StringComparisonMethods {

    public static void main(String[] args) {

        // String comparison methods

        // 1 -> contains() : Returns true if the string contains the specified sequence of char values
        String helloText = "Hello World";
        System.out.println(helloText.contains("World"));
        System.out.println("----- End of contains() examples -----");

        // 2 -> startsWith(String prefix) : Returns true if the character sequence represented by the argument is a prefix
        System.out.println(helloText.startsWith("Hel"));
        // Returns true if argument is empty string
        System.out.println(helloText.startsWith(""));
        // Offset tells where to begin looking in the string
        System.out.println(helloText.startsWith("Wor", 6));
        System.out.println("----- End of startsWith() examples -----");

        // 3 -> endsWith(String suffix) : Returns true if the character sequence represented by the argument is a suffix
        System.out.println(helloText.endsWith("ld"));
        System.out.println("----- End of endsWith() examples -----");

        // 4 -> regionMatches(toffset, String other, int ooffset, int len)
        // Compares a substring of this String to a substring of another String and returns true if
        // they represent identical character sequences.
        System.out.println(helloText.regionMatches(6, "World", 0, 5));
        System.out.println("----- End of regionMatches() examples -----");

        // 5 -> equals(Object obj)
        System.out.println(helloText.equals("Hello World"));

        // 5 -> equalsIgnoreCase(String str)
        System.out.println(helloText.equalsIgnoreCase("hello world"));
        System.out.println("----- End of equals() & equalsIgnoreCase() examples -----");
    }
}
