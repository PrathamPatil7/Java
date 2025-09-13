import java.util.*;

public class LoopQ{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers you want to input: ");
        int count=sc.nextInt();

        int evensum=0;
        int oddsum=0;

        for (int i=0; i<count; i++) {
            System.out.print("Enter Number: "+(i+1)+":");
            int num=sc.nextInt();

            if(num%2 == 0){
                evensum=num+evensum;
            }else{
                oddsum=num+oddsum;
            }
        }
         System.out.println("Sum of even numbers is:"+evensum);
         System.out.println("Sum of odd numbers is:"+oddsum);
         sc.close();
    }

}