class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int i = 1;
        int j = 0;

        while (i < n && j < n) {
            if (nums[j] != 0) {
                j++;
            } else if (nums[i] != 0 && j < i) {
                int temp = nums[i];
                nums[i++] = nums[j];
                nums[j++] = temp;
            } else {
                i++;
            }
        }
    }
}
