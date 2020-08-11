class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(nums.length,Collections.reverseOrder());
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        HashMap<Integer,List<Integer>> hashMap2 = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums.length ; i++){
            if(hashMap.get(nums[i]) != null){
                hashMap.put(nums[i], hashMap.get(nums[i]) + 1 );
            }else{
                hashMap.put(nums[i], 1);
            }
        }
        hashMap.forEach((key,v)-> {
            if(hashMap2.get(v) != null){
                hashMap2.get(v).add(key);
            }else{
                hashMap2.put(v, new ArrayList());
                hashMap2.get(v).add(key);
            }
        });
        hashMap.forEach((key,v)-> priorityQueue.add(v));
        while(list.size() < k){
            if(hashMap2.get(priorityQueue.peek()) != null){
                (hashMap2.get(priorityQueue.peek())).forEach(item -> list.add(item));
                hashMap2.remove(priorityQueue.remove());
            }else{
                priorityQueue.remove();
            }
        }
        return list;
    }
}