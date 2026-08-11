class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int count=0;
        int sum=0;
        int left=0;
        int target=threshold*k;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(i-left+1==k){
                if(sum>=target){
                    count++;
                }
                sum-=arr[left];
                left++;
            }
        }
        return count;
    }
}