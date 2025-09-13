import java.util.Scanner;

public class Switch{
    public static void main(String[] args){
          Scanner sc=new Scanner(System.in);

          System.out.println("Enter Number for surprise:");
          int num=sc.nextInt();

          switch (num) {
              case 1:System.out.println("Le bhai tere liye samosa");
                      break;
              case 2:System.out.println("Tu le Burger");
                      break;
              case 3:System.out.println("Tu le pizza");
                      break;   
              default:System.out.println("Mote gym chale ja");
                  throw new AssertionError();
          }

    }
}