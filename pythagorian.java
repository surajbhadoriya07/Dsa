import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        int k = sc.nextInt();

        if (i * i == j * j + k * k) {
            System.out.println("pythgorous");
        } else {
            System.out.println("not pythgorous");
        }
    }
}
