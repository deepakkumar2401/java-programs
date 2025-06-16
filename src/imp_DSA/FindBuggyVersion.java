package imp_DSA;

public class FindBuggyVersion {

    public static int findBuggyVersion(String[] versions, BugChecker checker) {
        int left = 0, right = versions.length - 1;
        int buggy = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (checker.hasBug(versions[mid])) {
                buggy = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return buggy;
    }

    interface BugChecker {
        boolean hasBug(String version);
    }

    public static void main(String[] args) {
        String[] versions = {"2025release101", "2025release102", "2025release103", "2025release104", "2025release105"};
        BugChecker checker = version -> version.equals("2025release103") || version.compareTo("2025release103") > 0;
        int buggyIndex = findBuggyVersion(versions, checker);
        System.out.println("Bug introduced at version: " + versions[buggyIndex]);
    }
}
