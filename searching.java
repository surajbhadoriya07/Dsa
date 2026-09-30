import java.util.*;

public class Main {
    static void findT(List<Integer> arr, int t) {
        for (int i = 0; i < arr.size(); i++) {
            if (t == arr.get(i)) {
                System.out.println("Target found at indx :" + i);
                return;
            }
        }
        System.out.println("Not found");
    }

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(2, 5, 7, 89, 3, 2);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the taget to be find:");
        int target = sc.nextInt();
        findT(arr, target);
    }
}
