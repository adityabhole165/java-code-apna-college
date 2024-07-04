public class SmallestNumberArray {
    public static int getSmallest(int numb[]){
        int Smallest = Integer.MAX_VALUE;
        for(int i=0;i<numb.length;i++){
            if(Smallest>numb[i]){
                Smallest=numb[i];
            }
        }
        return Smallest;
        
    }
    public static void main(String[] args) {
        int numb[]= {2,1,4,5};
    System.out.println("Smallest ="+getSmallest(numb));
    }
}
