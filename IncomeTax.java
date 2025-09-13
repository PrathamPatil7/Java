import java.util.Scanner;

public class IncomeTax{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your Annual Income: ");
        double income=sc.nextDouble();

        double tax=0;

        if (income<500000) {
            tax=0;
           System.out.println("No Tax"); 
        }
        else if (income>=500000 && income<=1000000) {
            tax=income*0.02;
           System.out.println("You will have to pay 20% TAX"); 
        }
        else if(income>1000000){
            tax=income*0.03;
            System.out.println("You will have to pay 30% Tax");


        }
        System.out.println("Your tax amount will be: " + tax);
        sc.close();
    }

}