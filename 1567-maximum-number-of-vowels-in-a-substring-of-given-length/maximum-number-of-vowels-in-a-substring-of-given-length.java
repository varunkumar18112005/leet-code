class Solution {
    public int maxVowels(String s, int k) {
        int max=0;
        int current=0;
       String vowels="aeiou" ;
        for(int i=0;i<k;i++){
            if(vowels.indexOf(s.charAt(i))!=-1){
                current++;
            }
        }
        max=current;
        for(int i=k;i<s.length();i++){
            if(vowels.indexOf(s.charAt(i))!=-1){
                current++;
            }
            if(vowels.indexOf(s.charAt(i-k))!=-1){
                current--;
            }
            max=Math.max(current,max);
            if(max==k){
                return max;
            }
        }
        return max;
    }
}