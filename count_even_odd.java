import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int even = 0;
        int odd = 0;

        do {
            int rem = n % 10;
            if (rem % 2 == 0) even++;
            else odd++;
            n /= 10;
        } while (n > 0);

        System.out.println("even count:" + even);
        System.out.println("odd count:" + odd);
    }
}
