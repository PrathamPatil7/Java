public class Floyds_traingleFunction{
    public static void Floyds_traingle(int n){
        int counter = 1;

        for(int i=1; i<=n; i++){         //outer loop for 5 rows
             for(int j=1; j<=i; j++){
                 System.out.print(counter+" ");
                 counter++;
             }
             System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        Floyds_traingle(5);
    }
}