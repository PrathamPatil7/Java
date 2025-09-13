//Entercostof3itemsfromtheuser(usingfloatdatatype)-apencil,apenandan eraser. 
//You have to output the total cost of the items back to the user as their bill.
//(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)

import  java.util.Scanner;

public class BillInputUser{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter cost of Pencil: ");
        float num1=sc.nextFloat();
        
        System.out.println("Enter cost of Pen: ");
        float num2=sc.nextFloat();

        System.out.println("Enter cost of eraser: ");
        float num3=sc.nextFloat();

        float total=num1+num2+num3;
        float gstrate=18;
        float gst=(total*gstrate)/100;

        float totalwithgst=total+gst;

        System.out.println("Your amount is: " + total);

        System.out.println("Your amount with gst of 18% is: " + totalwithgst );
    }   
}