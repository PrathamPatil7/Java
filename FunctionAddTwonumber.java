import java.util.Scanner;

public class FunctionAddTwonumber{  

    public static int addNumber(int a,int b){    //creating function
        return a + b;     //this will return value to main since main is calling this function
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter first number:");
        int a = sc.nextInt();

        System.out.print("Enter Second number:");
        int b = sc.nextInt();

        int sum = addNumber( a, b);   //function call

        System.out.println("Sum of  " + a +" "+ "and" +" "+ b +" "+ "is :"+sum);

        sc.close();  //scanner close

    }
}