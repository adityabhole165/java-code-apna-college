public class Butterfy {
    public static void ButterfyPatt(int n){
        // First half
        for(int i=1;i<=n;i++){
            //Stars *
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            // Spaces
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            // Stars *
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    
        // Second Half
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-i);j++){ 
                System.out.print(" ");
            }
            for(int j=1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        ButterfyPatt(7);
    }
}
