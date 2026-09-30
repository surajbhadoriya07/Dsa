import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int max = Integer.MIN_VALUE;
        int value = Math.abs(n);

        if (value == 0) max = 0;
        while (value > 0) {
            int rem = value % 10;
            if (rem > max) max = rem;
            value /= 10;
        }

        System.out.println(max);
    }
}
