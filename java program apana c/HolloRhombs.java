public class HolloRhombs {
    public static void HolloRhombus(int n){
        // Spaces
        for(int i=1;i<=n;i++){
            //Spaces
            for(int j=1;j<=(n-1);j++){
                System.out.print(" ");
            }
            //hollow Reactangle
            for(int j=1;j<=n;j++){
                if(i==1||i==n||j==1||j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
        System.out.println();
    }
    }
    public static void main(String[] args) {
        HolloRhombus(5);
    }
}
