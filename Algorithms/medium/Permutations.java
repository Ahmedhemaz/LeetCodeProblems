class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> permutationsList = new ArrayList<>();
        if (nums.length < 1) {
            return permutationsList;
        }
        List<Integer> choices = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            choices.add(nums[i]);
        }
        PermuteHelper(nums, choices, new ArrayList<Integer>(), permutationsList);
        return permutationsList;
    }

    public void PermuteHelper(int[] nums, List<Integer> choices, List<Integer> choosen,
            List<List<Integer>> permutationsList) {
        if (choosen.size() == nums.length) {
            permutationsList.add(choosen);
            return;
        }
        for (int i = 0; i < choices.size(); i++) {
            List<Integer> choosenCopy = new ArrayList<>(choosen);
            choosenCopy.add(choices.get(i));
            List<Integer> choicesCopy = new ArrayList<>(choices);
            choicesCopy.remove(i);
            PermuteHelper(nums, choicesCopy, choosenCopy, permutationsList);
        }
    }
}