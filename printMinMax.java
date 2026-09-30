public class Main {
    public static void main(String[] args) {
        int[] arr = {3, 5, 6, 7, 9, 7, 8, 0, 3, 10};

        int max = arr[0];
        int smax = -1;

        for (int x : arr) {
            if (max < x) {
                smax = max;
                max = x;
            }
        }

        System.out.println(smax);
    }
}
