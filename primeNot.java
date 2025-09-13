import java.util.Scanner;

public class primeNot{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n =sc.nextInt();

        if(n==2){
            System.out.println("Number is prime: ");
            return;
        }else{
            boolean isprime=true;
            for(int i=2; i<=Math.sqrt(n); i++){
                if(n % i == 0){
                    isprime=false;
                }
            }
            if(isprime == true){
            System.out.println("Number is Prime Number: ");
        }else{
            System.out.println("Number is not prime Number:");
        }
        }
        sc.close();
    }
}