class Solution {
    //  public int countdigits(int digit){
    //     int cnt=0;
    //     while(digit>0){
    //         cnt++;
    //         digit/=10;

    //     }
    //     return cnt;
    // }
    public int findNumbers(int[] nums) {
        int evenCnt=0;
        for(int num:nums){
            int cnt=Integer.toString(num).length();
            if(cnt%2==0) evenCnt++;
        }
        return evenCnt;
    }
}