class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int m = nums1.length;
        int n = nums2.length;

        int[] ans = new int[Math.min(m,n)];
            int idx=0;

        if (m >n) {
            for (int ele : nums1) {
                map.put(ele, map.getOrDefault(ele, 0) + 1);
            }

            for (int ele : nums2) {
                if (map.containsKey(ele) && map.get(ele)>0) {
                    ans[idx++] = ele;
                    map.put(ele, map.get(ele) - 1);
                }
            }
        }

        else {
            for (int ele : nums2) {
                map.put(ele, map.getOrDefault(ele, 0) + 1);
            }

            for (int ele : nums1) {
                if (map.containsKey(ele) && map.get(ele)>0) {
                    ans[idx++] = ele;
                    map.put(ele, map.get(ele) - 1);
                }
            }
        }
        return Arrays.copyOfRange(ans,0,idx);

    }
}