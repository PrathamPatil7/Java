public class Arithmeticoperator{
    public static void main(String[] args) 
    {
        //arithmertic operator on integer
        int a1 = 10;
        int a2 = 10;

        //arithmetic operator on string
        String n1 = "15";
        String n2 = "25";

        //convert strng into integer
        int c1 = Integer.parseInt(n1);
        int c2 = Integer.parseInt(n2);

        System.out.println("a + b: " + (a1+a2));
        System.out.println("a - b: " + (a1-a2));
        System.out.println("a * b: " + (a1*a2));
        System.out.println("a / b: " + (a1/a2));
        System.out.println("a % b: " + (a1%a2));

        System.out.println("c1 + c2: " + (n1+n2));
    }
}