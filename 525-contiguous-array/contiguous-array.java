class Solution {
    public int findMaxLength(int[] nums) {
        int n=nums.length;

        HashMap <Integer,Integer> map=new HashMap <>();
        map.put(0,-1);
        int preSum=0;
        int maxLen=0;

        for(int i=0;i<n;i++){
            
            if(nums[i]==0){
                preSum--;
            }else{
                preSum++;
            }

            if(map.containsKey(preSum)){
                maxLen=Math.max(maxLen,i-map.get(preSum));
            }else{
                map.put(preSum,i);
            }
        }
        return maxLen;
        
    }
}