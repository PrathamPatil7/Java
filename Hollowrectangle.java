public class Hollowrectangle{
    public static void hollowrectangle(int totalrows,int totalcols){
        for(int i=1; i<=totalrows; i++){   // outer loop 
             for(int j=1; j<=totalcols; j++){   //inner columns
                if(i==1 || i==totalrows || j==1 || j==totalcols){   //cell(i,j)  (m,n)
                    System.out.print("*"+"");   //boundary cells
                }else{
                    System.out.print(" ");
                }
             }
             System.out.println("");
        }
        
    }

    public static void main(String[] args) {
        hollowrectangle(4, 5);
    }
}