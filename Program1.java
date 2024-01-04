 /*A peak element is an element that is strictly greater than its neighbors.

Given a 0-indexed integer array nums, find a peak element, and return its index. If the array contains multiple peaks, return the index to any of the peaks.
 
Input: nums = [1,2,1,3,5,6,4]
Output: 5
Explanation: Your function can return either index number 1 where the peak element is 2, or index number 5 where the peak element is 6.
*/


class PeakEle{
    void Element(int arr[]){
        int n=arr.length;
        for(int i=1;i<n-1;i++){
                if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                    System.out.println ("Peak element fount at :"+ i);
                }
            }
        
    }
}
class client{
    public static void main(String[] args){
        int arr[]=new int[]{1,2,1,3,5,6,4};
        
        PeakEle obj=new PeakEle();
        obj.Element(arr);

        
    }
}

/*class Solution {
    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[mid + 1]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}

class Client {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 1, 3, 5, 6, 4};

        Solution obj = new Solution();
        int peakIndex = obj.findPeakElement(arr);
        System.out.println("Peak element index: " + peakIndex);
    }
}*/
