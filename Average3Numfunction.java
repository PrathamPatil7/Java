import java.util.Scanner;
public class Average3Numfunction{
    public static double average(double  x,double  y,double  z){
        return x+y+z/3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int x=sc.nextInt();
        System.out.println("Enter Second number:");
        int y=sc.nextInt();
        System.out.println("Enter third number:");
        int z=sc.nextInt();

        System.out.println("The average value is "+average(x, y, z));
        
    }
}