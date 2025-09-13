import java.util.Scanner;

public class PrintReverse{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter N: ");
        int n=sc.nextInt();

       while(n>0){
        int lastDigit = n%10;  // here your from number last digit is remaing 
        System.out.print(lastDigit + " "); //remaining last digit is  getting printed
    
        n=n/10; //n/=10;  here your last digit is geeting vanished beacuse of /10
       }
    }
}