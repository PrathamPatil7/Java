import java.util.Scanner;

public class Calculator{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter First Number:");
        int num1=sc.nextInt();

        System.out.println("Enter Number two:");
        int num2=sc.nextInt();

        System.out.println("Enter operatoer between +,-,*,/,%");
        char operator=sc.next().charAt(0);

        switch (operator) {
             case '+':System.out.println("Addition of two number is:"+(num1+num2));
                     break;
             case '-':System.out.println("Subtraction of two number is:"+(num1-num2));
                     break;
             case '*':System.out.println("Multiplication of two number is:"+(num1*num2));
                     break;
             case '/':System.out.println("Division of two number:"+(num1/num2));
                     break;
             case '%':System.out.println("Modulus of two number:"+(num1%num2));
                     break;                           
            
                
            default:
                System.out.println("You have Selected wrong operator(input)");
        }
    }
}
