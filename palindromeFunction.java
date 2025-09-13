import java.util.Scanner;
public class palindromeFunction{
       public static boolean ispalindrome(int number){
            int mynum=number;
            int reverse=0;

            while(mynum!=0){
                int remainder=mynum%10;    // to get last digit of number
                reverse=reverse*10+remainder;  //shift previous digit left
                mynum=mynum/10; //Remove last  digit
            }

            return number==reverse;
       }
       public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int palindrome = sc.nextInt();

        if(ispalindrome(palindrome)){
            System.out.println("Number :"+" "+palindrome+" "+"is palindrome");
            
        }else{
            System.out.println("Number :"+" "+palindrome+" "+"is not palindrome");
        }

       }
}