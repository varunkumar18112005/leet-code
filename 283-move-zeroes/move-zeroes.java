class Solution {
    public void moveZeroes(int[] nums) {
        int low=0;
        for(int mid=0;mid<nums.length;mid++){
            if(nums[mid]!=0){
                int temp=nums[low];
                nums[low]=nums[mid];
                nums[mid]=temp;
                low+=1;
            }
        }
    }
}