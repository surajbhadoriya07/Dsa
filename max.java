import java.util.*;

public class Main {
    static int findM(List<Integer> arr) {
        int m = Integer.MIN_VALUE;
        for (int x : arr) {
            if (x > m) m = x;
        }
        return m;
    }

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(2, 5, 7, 89, 3, 2);
        System.out.println(findM(arr));
    }
}
