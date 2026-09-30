import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int w = sc.nextInt();

        int count = 0;
        for (int i = 1; i <= w; i++) {
            count += k * i;
        }

        System.out.println(Math.max(0, count - n));
    }
}
