public class DiamondPattern{
    public static void diamondPattern(int n){
        //1st half imp
        //outer loop (for no. of rows)
        for(int i=1; i<=n; i++){
            //space
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            //Star
            for(int j=1; j<=(2*i-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //2nd half nothing but just change on outer loop rest will remain same
        for(int i=n; i>=1; i--){
            //space
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            //Star
            for(int j=1; j<=(2*i-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        diamondPattern(4);
    }
}