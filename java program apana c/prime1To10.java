public class prime1To10 {
    public static void PrimeinRange(int n){
        for(int i=2;i<=n;i++){
            if (n%i==0) {
                System.out.println(i+"is  prime");
            }
        }
        System.out.println("the number is not prime");
    }
    public static void main(String[] args) {
        PrimeinRange(20);
    }
}
