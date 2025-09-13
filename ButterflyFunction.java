public class ButterflyFunction{
    public static void Butterfly(int n){
        ////1ST HALF
        //for row
        for(int i=1; i<=n; i++){
            //for star
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            //for space
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            //for star
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        ////2nd half
        //for row
        for(int i=n; i>=1; i--){
            //star
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            //for space
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            //for star
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
       
    }

    public static void main(String[] args) {
        Butterfly(4);
    }
}