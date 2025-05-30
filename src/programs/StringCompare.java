package programs;

public class StringCompare {

    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        String s3 = "abcabc";
        String b = s1 + s2;

        System.out.println(s1 == s2);

        System.out.println("------------");

        System.out.println(s3 + " :: " + b);
        System.out.println(s3.equals(b));
    }
}
