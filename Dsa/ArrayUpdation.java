public class ArrayUpdation{
    public static void main(String[] args) {
        int marks[] = new int[5];

        marks[2]=100;
        System.out.println("Your math marks are:"+marks[2]);

        marks[2]=400;
        marks[2]=marks[2]+1;

        System.out.println("Your math marks are:"+marks[2]);
    }
}