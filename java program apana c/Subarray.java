public class Subarray{
    public static void  subArry(int numA[]){
        int ts=0;
        
        for(int i=0; i<numA.length;i++){
            int start=i;
            for(int j=i;j<numA.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){//print
                    System.out.print(numA[k]+" ");//subarray
                    
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total sub arrays ="+ts);//total subarrays
    } 
    public static void main(String[] args) {
        int numA[] = {2,4,6,8,10};
        subArry(numA);
    }
}