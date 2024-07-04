

public class largest_Number_array {
    public static int getLargest(int numbr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<numbr.length;i++){
            if(largest < numbr[i]){
                largest= numbr[i];
            }
        }
        return largest; 
        }
    public static void main(String args[]){
        int numbr[]={1,2,6,3,5};
        System.out.println("largest ="+getLargest(numbr));
    }
}
