public class Solid_RhomBus{
    public static void Solid_RhomBuss(int n){
    for(int i=1; i<=n; i++){
        //Star
        for(int j=1; j<=(n-i); j++){
            System.out.print(" ");
        }
        //Space
        for(int j=1; j<=n; j++){
            System.out.print("*");
        }
        System.out.println();
        }
 
    }
    public static void main(String args[]){
        Solid_RhomBuss(5);
    }
}
