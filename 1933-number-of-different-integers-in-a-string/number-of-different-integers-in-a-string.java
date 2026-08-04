class Solution {
    public int numDifferentIntegers(String word) {

        HashSet <String> set=new HashSet<>();

        int i=0;

        while(i<word.length()){
            if(Character.isDigit(word.charAt(i))){
                StringBuilder sb=new StringBuilder();
                while(i<word.length() && Character.isDigit(word.charAt(i))){
                    sb.append(word.charAt(i));
                    i++;
                }

                int j=0;

                while(j<sb.length() && sb.charAt(j)=='0'){
                    j++;
                }      

                String num=sb.substring(j);
                if(num.length()==0){
                    num="0";
                }

                set.add(num);
            }else{
                i++;
            }
        }
        return set.size();
        
    }
}