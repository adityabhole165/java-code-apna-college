public class calciFunOverloading {
    public static int sum(int a , int b){
        return a+b;

    }
    public static int sum(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        System.out.println(" sum 1 = "+sum(3,4));
        System.out.println(" sum 2 ="+sum(1,2,3));
    }
}
