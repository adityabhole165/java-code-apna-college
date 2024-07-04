class diamond{
    public static void Diamondpatt(int n){
        // First half
        for(int i=1;i<=n;i++){
            //Spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            //Stars
            for( int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
        System.out.println();
        }
        //second half
        for(int i=n;i>=1;i--){
            //Spaces
            for(int j=1;j<=n;j++){
                System.out.print("");
            }
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
        System.out.println();
        }
    }
    public static void main(String[] args) {
        Diamondpatt(4);
    }
}