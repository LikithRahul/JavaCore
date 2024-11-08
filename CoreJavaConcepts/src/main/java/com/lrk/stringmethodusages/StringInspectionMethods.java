package com.lrk.stringmethodusages;

public class StringInspectionMethods {

    public static void main(String[] args) {

        // String inspection methods

        // 1 -> length() : Returns the length of this string
        String helloText = "Hello World";
        System.out.println(helloText.length());
        System.out.println("----- End of length() examples -----");

        // 2 -> charAt(int index) : Returns the char value at the specified index
        System.out.println(helloText.charAt(6));
        // Throws IndexOutOfBoundsException – if the index argument is negative or not less than the length of this string
        // System.out.println("".charAt(0));
        System.out.println("----- End of charAt() examples -----");

        // 3 -> isEmpty() : Returns true if length is zero
        System.out.println("".isEmpty()); // O/p is true
        System.out.println("    ".isEmpty()); // O/p is false
        System.out.println("----- End of isEmpty() examples -----");

        // 4 -> isBlank() : Returns true if length is zero or if string contains only whitespaces
        System.out.println("".isBlank()); // O/p is true
        System.out.println("    ".isBlank()); // O/p is true
        System.out.println("----- End of isBlank() examples -----");

        // 5 -> indexOf(int ch) / indexOf(int ch, int fromIndex) / indexOf(int ch, int beginIndex, int endIndex)
        System.out.println(helloText.indexOf('l'));
        System.out.println(helloText.indexOf('l', 9));
        System.out.println(helloText.indexOf('l', 4, 7));

        // indexOf(String str) / indexOf(String str, int fromIndex) / indexOf(String str, int beginIndex, int endIndex)
        System.out.println(helloText.indexOf("Wor"));
        System.out.println(helloText.indexOf("Wor", 5));
        System.out.println(helloText.indexOf("Wor", 5, 6));
        System.out.println("----- End of indexOf() examples -----");

        // 6 -> lastIndexOf(int ch) / lastIndexOf(int ch, int fromIndex)
        System.out.println(helloText.lastIndexOf('l'));
        System.out.println(helloText.lastIndexOf('l', 8));

        // lastIndexOf(String str) / lastIndexOf(String str, int fromIndex)
        System.out.println(helloText.lastIndexOf("Wor"));
        System.out.println(helloText.lastIndexOf("Wor", 5));
        System.out.println("----- End of lastIndexOf() examples -----");
    }
}
