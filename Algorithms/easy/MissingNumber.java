class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int maxNumber = nums.length;
        for (int i = nums.length - 1; i >= 0; i--) {
            System.out.println(nums[i]);
            if (maxNumber == nums[i]) {
                maxNumber--;
            } else {
                break;
            }
        }
        return maxNumber;
    }
}

// with bitmanipulation *revisit*
class Solution {
    public int missingNumber(int[] nums) {
        int x = nums.length;
        for (int i = 0; i < nums.length; i++) {
            x ^= i ^ nums[i];
        }
        return x;
    }
}