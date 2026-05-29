public class twoSums {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
                for(int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {};
    }
    public void main(String[] args) {
        int[] arr = {3,2,4};
        int target = 6;
        int[] ans = twoSum(arr, target);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}