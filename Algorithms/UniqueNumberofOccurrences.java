class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap counterMap = new HashMap<Integer,Integer>();
        HashSet<Integer> counterHashSet= new HashSet<Integer>(); 
        for(int i = 0; i< arr.length; i++){
                if(counterMap.get(arr[i]) != null) {
                    Integer temp = (Integer)counterMap.get(arr[i]);
                    Integer tempAdd = temp + 1;
                    counterMap.put(arr[i], tempAdd);
                }else {
                    counterMap.put(arr[i], 1);
                }
        }
        
        for (Object value : counterMap.values()) {
                if(!counterHashSet.add((Integer)value)){
                    return false;
                }
        }
        
     return true;   
    }
}