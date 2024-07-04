public class mySubSumself {
    public static void  subArry(int numA[]){
        int ts=0;
        int sum=0;
        int maxSum=0;
        double inf = Double. POSITIVE_INFINITY;
        double minSum=inf;
        for(int i=0; i<numA.length;i++){
            int start=i;
            for(int j=i;j<numA.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){//print
                    sum += numA[k];
                    System.out.print(numA[k]+" " );//subarray
                }
                ts++;
                System.out.print(" ="+sum);
                System.out.println();
                //max sum
                if(maxSum<sum){
                    maxSum=sum;
                }
                if(minSum>sum){
                minSum=sum;
                }
                sum=0;
                }
            System.out.println();
        }
        //max sum of sub arrays
        System.out.println("maximum sum of sub array "+maxSum);
        //min sum of sub arrays
        System.out.println("minimum sum of sub array "+minSum);
        //total subarrays
        System.out.println("total sub arrays ="+ts);
    } 
    public static void main(String[] args) {
        int numA[] = {2,4,6,8,10};
        subArry(numA);
    }
}
