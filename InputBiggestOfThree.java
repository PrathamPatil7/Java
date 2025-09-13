import java.util.Scanner;

public class InputBiggestOfThree{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first Number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter Second Number: ");
        int num2 = sc.nextInt();

        System.out.println("Enter Third Number: ");
        int num3 = sc.nextInt();

        int biggest;

        if (num1>=num2 && num1>=num3) {
            biggest = num1;
        }
        else if (num2>=num1 && num2>=num3) {
            biggest = num2;
            
        }
        else{
            biggest = num3;
        }

        System.out.println("The Biggest Number is: " + biggest);
    }
}