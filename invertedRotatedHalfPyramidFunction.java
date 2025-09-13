public class invertedRotatedHalfPyramidFunction{
    public static void inverted_Rotated_halfPyramid(int n){
        //outer loop for rows
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        inverted_Rotated_halfPyramid(4);
    }
}