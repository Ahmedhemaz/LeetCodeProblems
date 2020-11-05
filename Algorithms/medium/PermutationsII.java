class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> permutateList = new LinkedList<>();
        HashSet<List<Integer>> hset = new HashSet<>();
        List<Integer> choices = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            choices.add(nums[i]);
        }
        permuteHelper(nums, choices, new ArrayList<Integer>(), hset, permutateList);
        return permutateList;
    }

    public void permuteHelper(int[] nums, List<Integer> choices, List<Integer> choosen, HashSet<List<Integer>> hset,
            List<List<Integer>> permutateList) {
        if (choosen.size() == nums.length) {
            if (hset.add(choosen)) {
                permutateList.add(choosen);
            }
            return;
        }
        for (int i = 0; i < choices.size(); i++) {
            List<Integer> choosenCopy = new ArrayList<>(choosen);
            choosenCopy.add(choices.get(i));
            List<Integer> choicesCopy = new ArrayList<>(choices);
            choicesCopy.remove(i);
            permuteHelper(nums, choicesCopy, choosenCopy, hset, permutateList);
        }
    }
}