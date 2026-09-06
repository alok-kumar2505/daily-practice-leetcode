import java.math.BigInteger;

class Solution {
    public String addBinary(String a, String b) {
        BigInteger f=new BigInteger(a,2);
        BigInteger s=new BigInteger(b,2);
        // System.out.print(f+" "+s);
        BigInteger sum=f.add(s);
        return sum.toString(2);
    }
}