class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int cnt=0;
        int max=-1;

        for(int num:nums){
            if(num==1){
                cnt++;
            }else{
                cnt=0;
            }
            if(cnt>max){
                max=cnt;
            }
        }

        return max;
        
    }
}