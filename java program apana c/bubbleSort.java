public class bubbleSort {
    public static void bubbleSorte(int arr[]){
        for(int turn=0;turn<arr.length;turn++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={5,44,1,3,2};
        bubbleSorte(arr);
        printArr(arr);
    }
}
