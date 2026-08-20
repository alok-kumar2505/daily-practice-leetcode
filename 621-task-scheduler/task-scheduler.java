class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] freq=new int[26];

        for(char task:tasks){
            freq[task-'A']++;
        }

        PriorityQueue <Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int cnt:freq){
            if(cnt>0){
                pq.add(cnt);
            }
        }
        int time=0;
        while(!pq.isEmpty()){
            ArrayList <Integer> temp=new ArrayList<>();
            for(int i=0;i<=n;i++){
                if(!pq.isEmpty()){
                    int cnt=pq.poll();
                    cnt--;
                    if(cnt>0) temp.add(cnt);
                    time++;
                }else if(temp.isEmpty()){
                    break;
                }else{
                    time++;
                }
            }

            for(int t:temp){
                pq.add(t);
            }
        }

        return time;
    }
}