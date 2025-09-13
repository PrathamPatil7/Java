public class functionOverloading{
    public static int sum(int a,int b){
        return a+b;
    }

    public static int sum(int a,int b,int c){
        return a+b+c;
    }

    public static float sum(float d,float e){
        return d+e;
    }

    public static void main(String[] args) {
        int a=3;
        int b=3;
        int c=3;
        float d=4.556f;
        float e=3.7986f;

        int sum2=sum(a,b);
        int sum3=sum(a,b,c);
        float sum4=sum(d,e);

        System.out.println("Sum of a and b is:"+sum2);
        System.out.println("Sum of a,b,c is:"+sum3);
        System.out.println("Sum of d and e is:"+sum4);

    }
}