import java.util.Scanner;

public class inputtoN{
     public static void main(String [] args){
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter N: ");
          int n=sc.nextInt();
          int a = 1;
          System.out.println("Numbers from 1 to N:");
          while(a<=n){
               System.out.println(a);
               a++;
          }

     }
     
}