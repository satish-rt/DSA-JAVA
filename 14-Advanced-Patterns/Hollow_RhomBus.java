public class Hollow_RhomBus{
    public static void Hollow_RhomBuss(int n){
        for(int i=1; i<=n; i++){
            //Space
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }

            //Hollow_rectsngle
            for(int j=1; j<=n; j++){
                if(i==1 || j==1 || i==n || j==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Hollow_RhomBuss(5);
    }
}