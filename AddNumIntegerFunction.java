import java.util.Scanner;
public class AddNumIntegerFunction{
    public static int sumofinteger(int number){
        int sum=0;
        
        while(number!=0){
            int lastDigit=number%10;
            sum = lastDigit+sum;
            number=number/10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number=sc.nextInt();
    
        System.out.println("Sum of :"+(sumofinteger(number)));
        
    }
}