//WriteaJavaprogramtogetanumberfromtheuserandprintwhetheritispositive or negative.
import java.util.Scanner;

    public class PositiveOrNegative{
        public static void main(String[] args){
           Scanner sc = new Scanner(System.in);

           System.out.println("Enter First Number:");
           int a=sc.nextInt();

        

           String result = (a>=0)?"Positve":"Negative";

           System.out.println("Your number is:"+result);
        }
    }