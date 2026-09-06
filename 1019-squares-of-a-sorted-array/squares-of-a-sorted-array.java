class Solution {
   
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int st=0;
        int end=n-1;
        int[] ans=new int[n];

        for(int i=n-1;i>=0;i--){
            int sq1=nums[st]*nums[st];
            int sq2=nums[end]*nums[end];
            if(sq1>=sq2){
                ans[i]=sq1;
                st++;
            }else{
                ans[i]=sq2;
                end--;
            }
        }
        return ans;
    }
}