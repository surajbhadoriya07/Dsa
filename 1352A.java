import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> ar = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            ar.add(sc.nextInt());
        }

        for (int value : ar) {
            List<Integer> arr = new ArrayList<>();
            int c = 1;
            int a = value;
            int count = 0;

            while (a > 0) {
                int r = a % 10;
                if (r != 0) {
                    r *= c;
                    arr.add(r);
                    count++;
                }
                c *= 10;
                a /= 10;
            }

            System.out.println();
            System.out.println(count);
            for (int x : arr) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
