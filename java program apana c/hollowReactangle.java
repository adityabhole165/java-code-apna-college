public class hollowReactangle {
    public static void hollowreactangle(int totrows,int totcolms){
        for(int i=1;i<=totrows;i++){
            for(int j=1;j<=totcolms;j++){
                if (i==1||i==totrows||j==1||j==totcolms) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
        System.out.println();
        }
        
    
    }
    public static void main(String[] args) {
        hollowreactangle(4, 5);
    }
}
