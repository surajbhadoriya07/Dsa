import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // The original C++ file is incomplete:
        // vector<int> arr[n]; for(int i)
        // Keep the available intent without inventing missing logic.
        @SuppressWarnings("unchecked")
        List<Integer>[] arr = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            arr[i] = new ArrayList<>();
        }

        System.out.println("Incomplete source preserved: initialized " + n + " vectors.");
    }
}
