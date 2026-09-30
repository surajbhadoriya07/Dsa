import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        Map<Integer, Integer> h = new HashMap<>();
        for (int x : arr) h.put(x, h.getOrDefault(x, 0) + 1);

        int ans = 0;
        for (Map.Entry<Integer, Integer> e : h.entrySet()) {
            if (e.getValue() == 1) ans = e.getKey();
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] == ans) {
                System.out.println(i + 1);
                break;
            }
        }
    }
}
