package Excersice;

public class StringTest {
    public static void main(String[] args) {
        System.out.println("hello world".length());
        System.out.println("Hello world \"Murali Suganya\"");

        String s1 ="wwww cat";
        String s2 ="cat";
        System.out.println("Equal "+s1.equals(s2));
        System.out.println("EqualsIgnore " +s1.equalsIgnoreCase(s2));

        System.out.println("Length of s1 "+s1.length());
        System.out.println("char at :"+s1.charAt(1));

        System.out.println("Substring "+s1.substring(0, 2));

        System.out.println("Index of "+s1.indexOf(s2));

        System.out.println("Compare "+s1.compareTo(s2));

    }
}
