import java.util.Scanner;

public class ifElse{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age=sc.nextInt();

        if (age>=18) {
            System.out.println("Since you are adult");
            System.out.println("You can vote");
            System.out.println("You can drive");
            System.out.println("You can go to college");
            System.out.println("Thank you ");
        }
        if (age>13 && age<18) {
            System.out.println("You are teenager");
        }
        else{
            System.out.println("You are not adult");
        }
    }
}