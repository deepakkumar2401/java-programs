package com.te.programs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CommonElement {

    public static void main(String[] args) {
        int arr1[] = {1, 2, 3};
        int arr2[] = {3, 6, 5, 4, 2};

        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();

        for (Integer integer : arr1) {
            set.add(integer);
        }

        for (Integer integer : arr2) {
            if (set.contains(integer)) {
                list.add(integer);
            }
        }
        System.out.println("common element is:" + list);
    }
}
