package imp_DSA;

import java.util.*;

public class BadRequestFinder {

    static boolean isBadRequest(int id) {
        return id % 2 == 0; // For demo: even numbers are bad
    }

    public static List<Integer> getBadRequests(int[] requestIds) {
        List<Integer> badRequests = new ArrayList<>();
        for (int id : requestIds) {
            if (isBadRequest(id)) {
                badRequests.add(id);
            }
        }
        return badRequests;
    }

    public static void main(String[] args) {
        int[] requestIds = {1, 2, 3, 4, 5, 6};
        List<Integer> bad = getBadRequests(requestIds);
        System.out.println("Bad Requests: " + bad);
    }
}

