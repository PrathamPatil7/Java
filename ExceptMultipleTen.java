import java.util.Scanner;

public class ExceptMultipleTen{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         
        do { 
            System.out.println("Enter your number: ");
            int n=sc.nextInt();
            if( n % 10 == 0 ){
                System.out.println("You entered multiple of 10 Number skip");
                continue;
            }
            System.out.println("Your Number is: "+n);
        } while (true);
          
    }
}