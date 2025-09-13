public class primesinrangeFunction{
    public static boolean isprime(int n){   //creating function which recognize which number is prime
         if(n == 2){
            return true;
         }
         for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
         }
         return true;
    }

    public static void RangeinPrime(int n){   //creating function which print prime numbers from 2 to n 
        for(int i=2; i<=n; i++){
            if(isprime(i)){  //true  calling function that checks number is prime or not
                System.out.print(i+" ");
            }
        }
    }

    public static void main(String[] args) {
        RangeinPrime(10);   // 2 to 10 primes
        // RangeinPrime();
        // RangeinPrime();
    }
}