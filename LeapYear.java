import java.util.Scanner;

public class LeapYear{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a year:");
        int year=sc.nextInt();

        if (year%400==0){
            System.out.println("Congratulation its an leap year:");
            
        }
        else if (year%100==0) {
            System.out.println(" Its not an leap year:");
        }
        else if (year%4==0) {
            System.out.println("Congratulation its an leap year:");
        }
        
        
        else{
            System.out.println("Its not an leap year:");
        }
    }
}