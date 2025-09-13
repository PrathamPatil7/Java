public class abproductFunction{
    public static  int product(int a,int b ){
           a = 10;
           b = 10;
          return a*b;
    }
public static void main(String[] args) {
    int a =3;
    int b =5;

    int result = product(a,b);
    System.out.println("Product of a and b is :"+result);//since function is getting used 
    System.out.println("Product of a and b is :"+(a*b));//main value is getting used
    
    
}
}
   
