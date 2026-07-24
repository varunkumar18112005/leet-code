class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
       long actual_sum=0;
       long squared_sum=0;
       int n=grid.length*grid[0].length;
       for (int i=0;i<grid.length;i++){
        for(int j=0;j<grid[i].length;j++){
            actual_sum+=grid[i][j];
            squared_sum+=(long)grid[i][j]*grid[i][j];
        }
       }
       long Expected_sum=(long)(n*(n+1))/2;
       long Expected_square_sum=(long)(n*(n+1)*(2L*n+1))/6;
       long diff=actual_sum-Expected_sum;
        long squareDiff = squared_sum - Expected_square_sum;
        long sqd=squareDiff/diff;
        int r=(int)(sqd+diff)/2;
        int m=(int)(r-diff);
        return new int[]{r,m};
    }
}