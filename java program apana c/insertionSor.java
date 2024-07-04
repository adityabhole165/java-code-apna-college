class insertionSor{
    
    public static void insertionSorting(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            int prev=i-1;
            //finding out the coorect position to insert
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1]=curr;
        }
    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    System.out.println();
    }
    public static void main(String[] args) {
        int arry[]={5,4,1,2,3};
        insertionSorting(arry);
        printArr(arry);
    }

}