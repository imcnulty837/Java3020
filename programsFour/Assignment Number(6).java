//Ian McNulty Assignment 4 Problem 6 2/26/2020
import java.math.BigInteger;

class TestSix {
    public static void main(String[] args) {
        BigInteger big = new BigInteger(String.valueOf(Long.MAX_VALUE));

        int i = 0;
        while (i < 10){
            big = big.add(new BigInteger("1"));
            if ((big.remainder(new BigInteger("5"))).compareTo(new BigInteger("0")) == 0 || 
                (big.remainder(new BigInteger("6"))).compareTo(new BigInteger("0")) == 0){
                System.out.println(big);
                i++;
            }
        }
    }
}