package com.te.programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseStringJoin {

    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(inputStreamReader);

        System.out.print("enter Sentence:");
        String str = reader.readLine();

        List<String> list = Arrays.asList(str.split(" "));

        Collections.reverse(list);
        String join = String.join(".", list);
        System.out.println(join);
    }
}
