
import java.util.Scanner;

public class ArrayInput{
    public static void main(String[] args) {
        int Marks[] = new int[100]; //100 size 
        
        //Input
        Scanner sc = new Scanner(System.in);
       // int maths;
        //maths = sc.nextInt();
        //int Phy;
        //Phy = sc.nextInt();
        //int chemistry;
        //chemistry = sc.nextInt();
        System.out.println("Enter Maths Marks: ");
        Marks[0] = sc.nextInt();  //Maths
        System.out.println("Enter Phy Marks: ");
        Marks[1] = sc.nextInt();  //phy
        System.out.println("Enter Chem Marks: ");
        Marks[2] = sc.nextInt();  //chem

        //output
        System.out.println("Maths marks: " + Marks[0]);  //maths marks
        System.out.println("Phy marks: " + Marks[1]);  //maths marks
        System.out.println("Chem marks: " + Marks[2]);  //maths marks
                

    }
}