package interview;

interface Predicate<T> {
    boolean test(T t);
}

public class CustomPredicate {

    public static void main(String[] args) {
        Predicate<String> predicate = t -> Integer.parseInt(t) > 10;

        System.out.println(predicate.test("2"));
    }
}
