public class CharacterPattern{
    public static void main(String[] args) {
        int n=4;
        char ch ='A';

        for(int i=1;i<=n;i++){  //For line 4 line or row that why n=4 i<=4
            for(int j=1; j<=i; j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }  
}