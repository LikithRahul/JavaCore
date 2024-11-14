package com.lrk.stringmethodusages;

public class StringBuilderExamples {

    public static void main(String[] args) {

        String helloText = "Hello World";
        // creates new string and returns reference to the new string.
        // values doesn't change if reference is not assigned to helloText variable
        helloText.concat("Good Bye");

        StringBuilder builderTest = new StringBuilder("Hello World");
        // appends to the same string and returns a self reference
        builderTest.append("Good Bye");

        printInformation(helloText);
        printInformation(builderTest);
        System.out.println("----- End of append() examples -----");

        StringBuilder emptyStr =  new StringBuilder();
        // Capacity is assigned at the beginning and needs to request more if the string length breaks the threshold
        emptyStr.append("A".repeat(10));
        // Predefined capacity
        StringBuilder emptyStr32 =  new StringBuilder(32);
        emptyStr32.append("A".repeat(20));

        printInformation(emptyStr);
        printInformation(emptyStr32);
        System.out.println("----- End of capacity() examples -----");

        StringBuilder stringBuilderPlus = new StringBuilder("Hello World");
        stringBuilderPlus.append(" good Bye");
        System.out.println(stringBuilderPlus);

        // deleteCharAt(int index) : Removes the char at the specified position in this sequence.
        // insert(int offset, char c) : Inserts the string representation of the char argument into this sequence
        stringBuilderPlus.deleteCharAt(12).insert(12, 'G');
        System.out.println(stringBuilderPlus);
        System.out.println("----- End of delete() and insert() examples -----");


        // replace(int start, int end, String str) : Replaces the characters in a substring of this sequence
        // with characters in the specified String.
        stringBuilderPlus.replace(12, 13, "g");
        System.out.println(stringBuilderPlus);
        System.out.println("----- End of replace() examples -----");

        // reverse() : Causes this character sequence to be replaced by the reverse of the sequence
        // setLength(int newLength) : Sets the length of the character sequence
        stringBuilderPlus.reverse().setLength(11);
        System.out.println(stringBuilderPlus);
        System.out.println("----- End of reverse() examples -----");
    }

    public static void printInformation(String string) {
        System.out.println("String = " + string);
        System.out.println("Length = " + string.length());
    }

    public static void printInformation(StringBuilder string) {
        System.out.println("StringBuilder = " + string);
        System.out.println("Length = " + string.length());
        System.out.println("Capacity = " + string.capacity());
    }

}
