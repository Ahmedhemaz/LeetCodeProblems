class Solution {
    public int search(int[] nums, int target) {
        // two pointer first and last 
        // if right bigger than left  
        // so right + 1 is the pivot
        int left = 0;
        int right = nums.length - 1;
        int targetIndex = 0;
        if(nums.length == 0) return -1;
        while(nums[left] > nums[right]) {
            if(target == nums[right]){
                return right;
            }
            right --;
        }
        
        
        // if we didn't find our target then we will do a binary search from our right index
        // to the beginning of the array
        return this.binarySearch(nums, left, right, target);
    }
    
    int binarySearch(int arr[], int l, int r, int x) 
    { 
        if (r >= l) { 
            int mid = l + (r - l) / 2; 
  
            // If the element is present at the 
            // middle itself 
            if (arr[mid] == x) 
                return mid; 
  
            // If element is smaller than mid, then 
            // it can only be present in left subarray 
            if (arr[mid] > x) 
                return binarySearch(arr, l, mid - 1, x); 
  
            // Else the element can only be present 
            // in right subarray 
            return binarySearch(arr, mid + 1, r, x); 
        } 
  
        // We reach here when element is not present 
        // in array 
        return -1; 
    } 
}