class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
          int n = grid.length;
        int size = n * n;
        int[] frequency=new int[size+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<grid[i].length;j++){
                frequency[grid[i][j]]++;
            }
        }
        int repeated =0;
        int missing=0;
        for(int i=0;i<frequency.length;i++){
            if(frequency[i]==2){
                repeated=i;
            }if(frequency[i]==0){
                missing=i;
            }
        }
        return new int[]{repeated,missing};
    }
}