

public class binToDec {
    public static void Dec(int binNum){
        int mynumber = binNum;
        int decNum = 0 ; 
        int pow=0;
        
        
        
        while (binNum>0) {
            int last= binNum%10;
            decNum+=(last* (int ) Math.pow(2,pow));

            pow++;
            binNum=binNum/10;
        }
        System.out.println("Deciml of  "+mynumber +" =" +decNum);
    }
    public static void main(String[] args) {
        Dec(101);
    }
}
