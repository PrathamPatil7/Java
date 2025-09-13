import java.util.Scanner;

public class EnterNumber{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);

       do { 
        System.out.println("Enter your number: ");
        int n=sc.nextInt();
        
        if(n % 10 ==0){
            break;
        }
        System.out.println("Your entered number is: "+n);   
       } while (true);
       System.out.println("You entered multiple of 10 loop stopped");
    }
}