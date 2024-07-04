public class code {
    public static void patt(int n){
        //outer
        for(int i =1;i<=n;i++){
            //Space
            for(int j=1;j<n-i;j++){
                //patt                 
                System.out.print("");

                }for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                    System.out.println(); 

        }
    }
    public static void main(String[] args) {
        patt(4);
    }
    
}
