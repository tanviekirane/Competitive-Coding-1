// Time Complexity : O(log n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

class Problem1 {

    /** initialize your data structure here. */
    public Problem1() {
    }
    public static int binarySearch(int[] nums){
        int low=0; int high = nums.length-1;
        while(low < high){
            int mid = low + (high-low)/2;
            if(nums[mid] == mid + 1){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        // low == high == mid
        return low + 1;
    }

    public static void main(String args[]){
        int[] arr = new int[]{1,3,4,5,6,7,8};
        System.out.println(binarySearch(arr));
    }
}

