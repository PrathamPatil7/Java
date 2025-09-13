public class biggestOfthree{
    public static void main(String[] args) {
         int a=20;
         int b=100;
         int c=80;

         

         if (a>=b && a>=c) {
           System.out.println("The biggest number is a : " + a ); 
         }
         else if (b>=a && b>=c) {
           System.out.println("The biggest number is b : " + b); 
         }
         else {
           System.out.println("The biggest number is c :  " + c);
         }

         
    }
}