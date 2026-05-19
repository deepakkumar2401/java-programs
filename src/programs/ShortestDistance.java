package programs;

import java.util.ArrayList;

public class ShortestDistance {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("geeks");
        list.add("for");
        list.add("geeks");
        list.add("contribute");
        list.add("practice");

        String word1 = "geeks";
        String word2 = "practice";

        int distance = shortestDistance(list, word1, word2);

        System.out.println(list);
        System.out.println("minimum distance between " + word1 + " and " + word2 + " is---" + distance);
    }

    public static int shortestDistance(ArrayList<String> s, String word1, String word2) {
        int index1 = -1;
        int index2 = -1;

        int minDistance = Integer.MAX_VALUE;

        for (int i = 0; i < s.size(); i++) {
            if (s.get(i).equals(word1)) {
                index1 = i;
            }
            if (s.get(i).equals(word2)) {
                index2 = i;
            }

            if (index1 != -1 && index2 != -1) {
                int distance = Math.abs(index1 - index2);
                minDistance = Math.min(minDistance, distance);
            }
        }
        return minDistance;
    }
}



