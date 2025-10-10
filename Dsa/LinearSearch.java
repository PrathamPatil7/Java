public class LinearSearch{
     public static int Linearsearch(int numbers[],int key){
    for(int i=0; i<numbers.length; i++){
        if(numbers[i]==key){
             return i;
        }
    }
         return -1; //key does not present
    }
    
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10,12,14,16};
        int key=10;

        int index=Linearsearch(numbers,key);
        if(index==-1){
            System.out.println("Not found");
        }else{
            System.out.println("Key is at index: "+index);
        }
    }
}                 //time complexity is O(n)