
public class LeetCode {


    public static  int searchInRotatedArr(int[] nums, int target) {
        int low = 0;
        int high = nums.length;
        while(low<high){
            int mid = (low+high)/2;
            if(nums[mid] == target) return mid;
            if (nums[low] <= nums[mid]){
                if (target>=nums[low] && target<nums[mid]){
                    high = mid-1;
                }else{
                    low = mid+1;
                }
            } else if(nums[mid]<=nums[high]){
                if(nums[mid]<target && nums[high]>=target){
                    low = mid+1;
                }else high= mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
//        System.out.println(maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
        System.out.println(gcd(24,96));
        
    }
    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int total = 0;
        while (left<right) {
            total = Math.max(total,Math.min(height[left], height[right])*(right-left));
            if (height[left]<height[right]){
                left++;
            }else right--;
        }
        return total;
    }
    public static int gcd(int num, int deno){
        if (deno%num==0) return num;
        return gcd(deno%num,num);
    }

}
