package com.lrk.stringmethodusages;

public class StringManipulationMethods {
    public static void main(String[] args) {

        //Date in the format "dd/MM/yyyy"
        String birthDate = "25/11/1999";

        // indexOf(String str) : Find the index of the substring "1999" in the birthDate string
        int index = birthDate.indexOf("1999");

        // substring(int index) : Returns substring starting at the specified index and extends to the end of this string.
        System.out.println("Year =" + birthDate.substring(index));


        // substring(int beginIndex, int endIndex) : Returns the substring at starting at beginIndex to endIndex-1
        System.out.println("Month =" + birthDate.substring(3,5));
        System.out.println("----- End of substring() examples -----");

        // join(CharSequence delimiter, CharSequence... elements )
        // Returns a new String composed of copies of the CharSequence elements joined together with a copy of the specified delimiter.
        String newDate = String.join("/", "25", "11", "1999");
        System.out.println(newDate);
        System.out.println("----- End of join() examples -----");

        // Inefficient way of doing above operation using concat
        String secondNewDate = "10";
        secondNewDate= secondNewDate.concat("/12");
        secondNewDate= secondNewDate.concat("/2000");
        System.out.println(secondNewDate);
        System.out.println("----- End of concat() examples -----");


        //replace(CharSequence target, CharSequence replacement )
        //Replaces each substring of this string that matches the target with the specified replacement sequence.
        secondNewDate = secondNewDate.replace("/", "-");
        System.out.println(secondNewDate);

        //Replaces the first occurrence
        secondNewDate = secondNewDate.replaceFirst("-", "/");
        System.out.println(secondNewDate);

        //Replaces all occurrences
        secondNewDate = secondNewDate.replaceAll("/", "-");
        System.out.println(secondNewDate);
        System.out.println("----- End of replace() examples -----");

        // repeat(int count) : Returns a string whose value is the concatenation of this string repeated count times.
        System.out.println("ABC - ".repeat(3));
        System.out.println("----- End of repeat() examples -----");

        // repeat and add indent at the beginning
        // indent(int n) : Adjusts the indentation of each line of this string based on the value of n
        System.out.println("ABC - ".repeat(3).indent(8));

        // repeat and remove indent at the beginning
        // indent(int n) : Removes the indentation of each line of this string based on the value of n
        System.out.println("        ABC - ".repeat(3).indent(-2));
        System.out.println("----- End of indent() examples -----");


    }
}
