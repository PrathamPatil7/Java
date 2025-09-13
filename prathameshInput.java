import java.util.Scanner; //scanner class ko import kiya jo user se input leta hai(key board se data lena)

public class prathameshInput{
    public static void main(String[] pratham)//compulsory yahase program start hota hai 
    {
        Scanner input = new Scanner(System.in);//Ek scanner object bana rahe hai jiska naam input hai
        System.out.println("Enter your name:");//Ye user ke liye hai jisse ki use samajhe ki dalna kya hai
        String name = input.nextLine();//Iska matlab jo wo naam bolega wo name varable mai store hoga

        System.out.println("Hello,"+name);//isse again output dega ki Hello aur name variable mai stored naam 
    }
}