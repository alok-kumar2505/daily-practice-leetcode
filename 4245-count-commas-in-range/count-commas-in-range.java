class Solution {
    public int countCommas(int n) {
        if(n==1000) return 1;

        int req=n-1000;
        if(req>0){
            return req+1;
        }
        return 0;
    }
}