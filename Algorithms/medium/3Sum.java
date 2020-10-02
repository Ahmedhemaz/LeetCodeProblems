class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums.length < 3)
            return new ArrayList<>(); // if nums less than 3 element
        Arrays.sort(nums); // sort array
        Set<List<Integer>> set = new HashSet<>();
        for (int i = 0; i < nums.length - 2; i++) {
            int leftPointer = i + 1; // left
            int rightPointer = nums.length - 1; // right
            while (leftPointer < rightPointer) {
                int sum = nums[i] + nums[leftPointer] + nums[rightPointer];
                if (sum == 0)
                    set.add(Arrays.asList(nums[i], nums[leftPointer++], nums[rightPointer--]));
                else if (sum > 0)
                    rightPointer--;
                else if (sum < 0)
                    leftPointer++;
            }

        }

        return new ArrayList<>(set);
    }
}