class Solution {
    public int trap(int[] height) {
        //Optimat method 
        int n=height.length;
        int lMax=0,rMax=0,sum=0;
        int l=0;
        int r=n-1;

        while(l<=r){
            if(lMax<rMax){
                if(lMax>height[l]){
                    sum+=lMax-height[l];
                }else{
                    lMax=height[l];
                }
                l++;
            }else{
                if(rMax>height[r]){
                    sum+=rMax-height[r];
                }else{
                    rMax=height[r];
                }
                r--;
            }
        }
        
        return sum;
        
    }
}