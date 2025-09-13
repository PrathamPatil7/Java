import java.util.Scanner;

public class PrintSumofN{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter N:");
        int n=sc.nextInt();
        int sum=0;
        int i=1;

        while(i<=n){
           sum += i; //sim=sim+i
           i++;
        }    
        System.out.println("Sum of N is: "+sum);
    }
}