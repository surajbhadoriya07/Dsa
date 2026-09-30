import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int xf = 0, yf = 0, zf = 0;

        for (int i = 0; i < n; i++) {
            xf += sc.nextInt();
            yf += sc.nextInt();
            zf += sc.nextInt();
        }

        System.out.println((xf != 0 || yf != 0 || zf != 0) ? "NO" : "YES");
    }
}
