class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> istrue=new ArrayList<>();
            int max=candies[0];
        for(int i=0;i<candies.length;i++){
            if(candies[i]>max){
                max=candies[i];
            }
        }
        for(int i=0;i<candies.length;i++){
            int result=candies[i]+extraCandies;
            if(result<max){
                istrue.add(false);
            }else{
                istrue.add(true);
            }
        }
        return istrue;
    }
}