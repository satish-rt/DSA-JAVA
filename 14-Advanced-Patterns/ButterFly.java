public class ButterFly{
    public static void Butterfly(int n){
    for(int i=1; i<=n; i++){
        //Star
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        //Space
        for(int j=1; j<=2*(n-i); j++){
            System.out.print(" ");
        }
        //Star
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
        }


    for(int i=n; i>=1; i--){
        //Star
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        //Space
        for(int j=1; j<=2*(n-i); j++){
            System.out.print(" ");
        }
        //Star
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        System.out.println(); 
    }
}
    public static void main(String args[]){
    Butterfly(5);
    }
} 