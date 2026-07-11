class Solution {
    public boolean isVowel(char ch){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                    return true;
                }
                return false;

    }
    public int maxVowels(String s, int k) {


        int cnt=0;
        for(int i=0;i<k;i++){
            if(isVowel(s.charAt(i))){
                cnt++;
            }
        }
        int max=cnt;
        for(int i=k;i<s.length();i++){

            if(isVowel(s.charAt(i-k))){
                cnt--;
            }
            if(isVowel(s.charAt(i))){
                cnt++;
            }
            max=Math.max(max,cnt);
        }
        return max;
    }
}