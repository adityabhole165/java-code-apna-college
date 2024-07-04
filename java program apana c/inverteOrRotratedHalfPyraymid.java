public class inverteOrRotratedHalfPyraymid {
        public static void h(int n){
            //outer
            for(int i=1;i<=n;i++){
                //spaces
                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
                //pattern
                }for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
            System.out.println();
            }
            
        }
    public static void main(String[] args) {
        h(4);
    }
}
