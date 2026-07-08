class Solution {
    public int[] nse(int[] arr){
        int n=arr.length;
        int[] nse=new int[n];
        Stack <Integer> st=new Stack<>();

        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            nse[i]=st.isEmpty()?n:st.peek();
            st.push(i);
        }
        return nse;
    }

    public int[] pse(int[] arr){
        int n=arr.length;
        int[] pse=new int[n];
        Stack <Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }

            pse[i]=st.isEmpty()?-1:st.peek();

            st.push(i);
        }
        return pse;

    }
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int[] nse=new int[n];
        int[] pse=new int[n];
        nse=nse(heights);
        pse=pse(heights);

        int max=-1;
        for(int i=0;i<n;i++){
            int ans=(nse[i]-pse[i]-1)*heights[i];
            System.out.print(ans+",");
            max=Math.max(max,ans);
        }
        return max;
        
    }
}