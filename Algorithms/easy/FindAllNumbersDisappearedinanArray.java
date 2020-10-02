// naive solution
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int[] tempArray = new int[nums.length];
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            tempArray[i] = i + 1;
            set.add(nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(tempArray[i])) {
                ans.add(tempArray[i]);
            }
        }
        return ans;
    }
}

// using only 1 temp array to mark exist numbers

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        boolean[] temp = new boolean[nums.length];
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] - 1;
        }

        for (int i = 0; i < nums.length; i++) {
            temp[nums[i]] = true;
        }

        for (int i = 0; i < nums.length; i++) {
            if (temp[i] == false) {
                ans.add(i + 1);
            }
        }

        return ans;
    }

}