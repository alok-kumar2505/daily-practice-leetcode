class Solution {
    public int maxArea(int[] height) {
        int st=0;
        int n=height.length;
        int end=n-1;
        int max=-1;
        while(st<=end){
            if(height[st]<=height[end]){
                int area=height[st]*(end-st);
                max=Math.max(max,area);
                st++;
            }else{
                int area=height[end]*(end-st);
                max=Math.max(max,area);
                end--;
            }
            System.out.print(max);
        }
        return max;
        
    }
}