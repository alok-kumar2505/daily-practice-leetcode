class Solution {
    public List<String> commonChars(String[] words) {
        List <String> ans=new ArrayList<>();

        String[] temp=words.clone();
        for(char ch:temp[0].toCharArray()){
            boolean found=true;

            for(int i=1;i<words.length;i++){
                int idx=temp[i].indexOf(ch);
                if(idx==-1){
                    found=false;
                    break;
                }

                temp[i]=temp[i].substring(0,idx)+temp[i].substring(idx+1,temp[i].length());
            }

            if(found){
                ans.add(String.valueOf(ch));
            }
        }

        return ans;

    }
}