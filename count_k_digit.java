import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.print("enter the digit to be count:");
        int x = sc.nextInt();

        int count = 0;
        do {
            int rem = n % 10;
            if (rem == x) count++;
            n /= 10;
        } while (n > 0);

        System.out.println(count);
    }
}
