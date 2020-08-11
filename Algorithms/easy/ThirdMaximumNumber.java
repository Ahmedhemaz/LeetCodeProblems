class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> setOfNumbers = new HashSet<>();
        PriorityQueue<Integer> pQueue =  
             new PriorityQueue<Integer>(Collections.reverseOrder()); 
        for(int i = 0; i < nums.length; i++){
            setOfNumbers.add(nums[i]);
        }
        for(Integer number : setOfNumbers){
            pQueue.add(number);
        }
        if(setOfNumbers.size() >= 3){
            for(int i = 0; i<2; i++){
                pQueue.poll();
            }
            return pQueue.poll();    
        }else{
            return pQueue.poll();
        }
        
        
    }
}