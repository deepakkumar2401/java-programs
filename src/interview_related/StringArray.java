package interview_related;

public class StringArray {

    public static void main(String[] args) {
        String str = "Ram, mohan, raju, ajay, karthik";
        String s = str.replace(',', ' ');
        String[] s1 = s.trim().split(" ");
        for (String string : s1) {
            System.out.print(string + " ");
        }
    }
}
