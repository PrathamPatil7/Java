import java.util.Scanner; //import class Scanner for input(user)

public class AddTwoNo{ 
    public static void main(String[] pratham)
    {
        Scanner input = new Scanner(System.in);//Ek scanner object banaya hai jiska naam input hai
        System.out.println("Enter First Number: ");//ye user ke liye hai jisse ki wo number e sake
        int num1 = input.nextInt();//num1 varabale banaya hai jismai user ka 1st no. store hoga
        System.out.println("Enter Second Number: ");//second no user se lega
        int num2 = input.nextInt();//second number num2 varable mai store karega

        int sum = num1+num2;//sum variable ka naam hai jismai num1 and num 2 ka add hoga

        System.out.println("The sum is: "+sum);//ouput dega ki The sum is: sum variable(add of int1 and int 2)ka addition 
    }
}