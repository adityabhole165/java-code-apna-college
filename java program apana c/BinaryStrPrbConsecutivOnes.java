public class BinaryStrPrbConsecutivOnes{
    public static void printBinStr(int n , int lastPlace,String str){
        //base case
        if(n==0){
            System.out.println(str);
            return;
        }
        
        
        //kaam
        // if(lastPlace==0){
        //     //sit 0 on chair n
        //     printBinStr(n-1, 0, str.append("0"));
        //     printBinStr(n-1, 1, str.append("1"));
        // }else{
        //     printBinStr(n-1, 0, str.append("0"));
        // }

        //kaam
        printBinStr(n-1, 0, str+"0");
        if (lastPlace==0) {
            printBinStr(n-1, 1, str+"1");
        }
    }
    public static void main(String[] args) {
        printBinStr(3, 0,"");
    }
}
