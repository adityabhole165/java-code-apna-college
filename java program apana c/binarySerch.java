public class binarySerch{
    public static int binary(int number[],int key){
        int start =0,end = number.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            //comaprison
            if(number[mid]==key){
                //found
                return mid;
            }
            if(number[mid]<key){
                //right
                start=mid+1;
            }else{
                //left
                end=mid-1;
            }
            
        }
        
        return-1;

    }
    public static void main(String[] args){
        int number[]={2,4,6,8,10};
        int key=4;
        System.out.println("index for key is "+binary(number, key));
    }
}