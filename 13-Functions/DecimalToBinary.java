import java.util.*;
public class BinaryToDecimal{
    public static void DecToBin(int DecNum){
        int myNum = DecNum;
        int pow = 0;
        int BinNum = 0;
        while(DecNum > 0){
            int rem = DecNum %2;
                BinNum = BinNum + (rem*(int)Math.pow(10,pow));
                pow++;
                DecNum = DecNum /2;
        }
        System.out.println("The Binary Number of " + myNum + " is "+ BinNum);
    }
    public static void main (String args[]){
        DecToBin(7);
    }
}