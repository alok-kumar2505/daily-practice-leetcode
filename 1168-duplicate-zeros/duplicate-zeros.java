class Solution {
    public void duplicateZeros(int[] arr) {

        ArrayList <Integer> list=new ArrayList<>();
        int n=arr.length;
        int cnt=0;
        for(int num:arr){
            if(cnt>=n){
                break;
            }

            if(num==0 && list.size()<n-1){
                list.add(num);
                cnt++;
            }

            list.add(num);
            cnt++;
        }

        cnt=0;
        for(int num:list){
            arr[cnt]=num;
            cnt++;
        }
        
    }
}