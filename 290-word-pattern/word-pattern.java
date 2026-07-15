class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> map=new HashMap<>(); //charToWord
        HashMap <String,Character> strToChar=new HashMap<>();
        String[] str=s.split(" ");
        if(str.length!=pattern.length()) return false;

        int i=0;
        for(char ch:pattern.toCharArray()){
            if(map.containsKey(ch)){
                if(!(map.get(ch).equals(str[i]))){
                    return false;
                }
            }else{
                map.put(ch,str[i]);
                
            }

            if(strToChar.containsKey(str[i])){
                if(strToChar.get(str[i])!=ch){
                    return false;
                }
            }else{
                strToChar.put(str[i],ch);
            }



            i++;
        }
        return true;
    }
}