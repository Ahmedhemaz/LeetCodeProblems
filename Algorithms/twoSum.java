class Solution {
    public int[] twoSum(int[] nums, int target) {
     HashMap<Integer, ArrayList<Integer>> numsMap = new HashMap<>();
        int [] arr = new int [2];
        for(int i =0; i < nums.length; i++){
            if(numsMap.containsKey(nums[i])){
              ArrayList arrList =  numsMap.get(nums[i]);
                arrList.add(i);
            }else{
                ArrayList tempArrList = new ArrayList();
                tempArrList.add(i);
                numsMap.put(nums[i], tempArrList);    
            }
            
        }
        for(int i=0; i<nums.length;i++){
            if(nums[0] + nums[nums.length -1 ] == target){ 
                arr[0] = 0;
                arr[1] = nums.length -1;
                break;
            }
            if(numsMap.containsKey(target - nums[i])){
                arr[0] = i;
                arr[1] = numsMap.get(target - nums[i]).get(0);
                if(arr[0] == arr[1]){
                    continue;
                }
                System.out.println(arr[1]);
                if(nums[arr[0]] + nums[arr[1]] == target){
                    break;
                }
            }
        }
        return arr;
    }
}