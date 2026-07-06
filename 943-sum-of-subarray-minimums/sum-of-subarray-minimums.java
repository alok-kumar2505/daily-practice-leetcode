class Solution {

    public int[] nse(int[] arr){
        int n=arr.length;
        int[] nsee=new int[n];
        Stack <Integer> st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            nsee[i]=st.isEmpty()?n:st.peek();
            st.push(i);
        }
        return nsee;
    }

    public int[] pse(int[] arr){
        int n=arr.length;
        int[] psee=new int[n];
        Stack <Integer> st=new Stack<>();

        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()]>arr[i]){
                st.pop();
            }
            psee[i]=st.isEmpty()?-1:st.peek();
            st.push(i);
        }
    return psee;
    }
    public int sumSubarrayMins(int[] arr) {
        int n=arr.length;
        int MOD=(int)1e9+7;

        int[] psel=pse(arr);
        int[] nsel=nse(arr);
        long total=0;
        for(int i=0;i<n;i++){
            int left=i-psel[i];
            int right=nsel[i]-i;

            total=(total+(left * right * 1L * arr[i])%MOD)%MOD;
        }

return (int)total;
        
        
    }
}