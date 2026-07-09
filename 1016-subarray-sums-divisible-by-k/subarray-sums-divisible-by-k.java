class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap <Integer,Integer> map=new HashMap<>();
        int n=nums.length;

        int presum=0;
        int cnt=0;

        map.put(0,1);

        for(int i=0;i<n;i++){
            presum=presum+nums[i];
            int div=presum%k;
            if(div<0){
                div=k+div;
            }
            if(map.containsKey(div)){
                cnt+=map.get(div);
            }
            map.put(div,map.getOrDefault(div,0)+1);
        }
        return cnt;
    }
}