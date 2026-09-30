import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int n = a;
        int sum = 0;

        while (n > 0) {
            int rem = n % 10;
            sum = sum * 10 + rem;
            n /= 10;
        }

        if (a == sum) {
            System.out.println(a + " is a Palindrome num");
        } else {
            System.out.println(a + " is not a Palindrome num");
        }
    }
}
