class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(nums.length,Collections.reverseOrder());
        for(int i = 0; i < nums.length; i++){
            priorityQueue.add(nums[i]);
        }
        
        for(int j = 1; j<k ; j++){
            priorityQueue.remove();
        }
        
        return priorityQueue.remove();
   
    }
}