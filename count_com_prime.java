import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        for (int i = 1; i <= n; i++) {
            boolean composite = false;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    composite = true;
                    break;
                }
            }
            if (composite) count++;
        }

        System.out.println("composite:" + count + " prime:" + (n - count));
    }
}
