class Solution {
    public void rotate(int[] nums, int k) {
        // O(n*k)time , O(1) space
        for(int i = 1; i <=k; i++){
            this.shift(nums);    
        }
    }
    
    private void shift(int[] arr){        
        int lastIndexTemp = arr[arr.length-1];
        for(int i = arr.length-1; i > 0; i--){
            this.swap(arr,i,i-1);
        }
        // System.arraycopy(arr, 0, arr, 1, arr.length-1); 
        // arr[0] = lastIndexTemp;
    }
    private void swap(int[] arr, int from, int to){
        int temp;
        temp = arr[from];
        arr[from] = arr[to];
        arr[to] = temp;
    }
}
class Solution {
    public void rotate(int[] nums, int k) {
        // O(n) time, space O(n)
      int[] a = new int[nums.length];
      for (int i = 0; i < nums.length; i++) {
        a[(i + k) % nums.length] = nums[i];
      }
      for (int i = 0; i < nums.length; i++) {
        nums[i] = a[i];
      }
    }
  }

class Solution {
    public void rotate(int[] nums, int k) {
        // O(n) Time, O(1) space
      k %= nums.length;
      reverse(nums, 0, nums.length - 1);
      reverse(nums, 0, k - 1);
      reverse(nums, k, nums.length - 1);
    }
    public void reverse(int[] nums, int start, int end) {
      while (start < end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
        start++;
        end--;
      }
    }
  }