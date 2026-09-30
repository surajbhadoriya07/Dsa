import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the days:");
        int i = sc.nextInt();

        int[] arr = new int[i];
        for (int j = 0; j < i; j++) {
            arr[j] = sc.nextInt();
        }

        int c = 0;
        for (int j = 0; j < i; j++) {
            if (arr[j] >= 10 && arr[j] % 2 == 0) {
                c++;
            }
        }

        System.out.println("no of productive days: " + c);
    }
}
