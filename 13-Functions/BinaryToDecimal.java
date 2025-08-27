public class BinaryToDecimal{
    public static void BinToDec(int BinNum){
        int myNum = BinNum;
        int pow = 0;
        int DecNum = 0;
        while(BinNum>0){
            int lastDigit = BinNum % 10;
                DecNum = DecNum + (lastDigit*(int)Math.pow(2,pow));
                pow++;
                BinNum = BinNum /10;
        }
        System.out.println("The Decimal Number of " + myNum + " is "+ DecNum);
    }
    public static void main (String args[]){
        BinToDec(101);
    }
}