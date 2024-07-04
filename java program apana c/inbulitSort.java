import java.util.Arrays;
public class inbulitSort {
    public static void pri(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    System.out.println();
    }
    public static void main(String[] args) {
        int arry[]={5,4,1,2,3};
        Arrays.sort(arry);
        pri(arry);
    }
}
