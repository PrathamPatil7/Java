public class EvenOddargument{
    public static boolean isEven(int n){
        if(n%2==0){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        int a=10;
        int b=13;
        int c=4;

        System.out.println("int a is:"+isEven(a));
        System.out.println("int b is:"+isEven(b));
        System.out.println("int c is:"+isEven(c));
    }
}