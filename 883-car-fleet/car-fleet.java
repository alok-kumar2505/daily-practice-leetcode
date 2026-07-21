class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        
        int n=position.length;
        double[][] cars=new double[n][2];

        for(int i=0;i<n;i++){
            cars[i][0]=position[i];
            cars[i][1]=(double)((double)(target-position[i])/speed[i]);
        }

        Arrays.sort(cars,(a,b)->Double.compare(a[0],b[0]));
        // Stack <Double> st=new Stack();
        double maxTime=-1;
        int cnt=0;
        for(int i=cars.length-1;i>=0;i--){
            double time=cars[i][1];
            if(time>maxTime){
                maxTime=time;
                cnt++;
                // st.push(time);
            }
        }
        return cnt;
    }
}