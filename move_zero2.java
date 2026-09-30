import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) arr1[i] = sc.nextInt();

        List<Integer> arr2 = new ArrayList<>();

        for (int x : arr1) {
            if (x > 0) arr2.add(x);
        }
        for (int x : arr1) {
            if (x == 0) arr2.add(x);
        }

        for (int x : arr2) System.out.print(x + " ");
    }
}
