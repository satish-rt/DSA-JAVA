public class Inverted_Half_Pyramid_With_Number{
 public static void Inverted_Half_Pyramid_With_Numberr(int n){
    //Outer loop
    for(int i=1; i<=n ; i++){
        //Star
        for(int j=1; j<=n-i+1; j++){
            System.out.print(j);
        }
        System.out.println();
    }
 }
 public static void main(String args[]){
   Inverted_Half_Pyramid_With_Numberr(5);
 }
}
