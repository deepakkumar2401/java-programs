package interview_related;

import java.util.List;

public class Two_a_In_String {

    public static void main(String[] args) {
        List<String> list = List.of("akash", "anil", "patna", "deepak", "kolkata", "aman");

        List<String> finalList = list.stream().filter(s -> s.indexOf('a') != s.lastIndexOf('a')).toList();
        System.out.println("Final List of string containing at least two a=" + finalList);
    }
}
