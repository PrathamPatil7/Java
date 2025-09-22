public class Solid_Rhomus{
    public static void Solid_Rhomus(int n){
  for(int i=1; i<=n; i++){ //outerloop for no. of rows here 1 to 5
    //Spaces
    for(int j=1; j<=(n-i); j++){
        System.out.print(" ");
    }
    //star
    for(int j=1; j<=n; j++){
        System.out.print("*");
    }
    System.out.println();

  }
}
public static void main(String[] args) {
    Solid_Rhomus(5);
}
}


