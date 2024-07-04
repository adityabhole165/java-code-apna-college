import java.util.Scanner;

public class prodcutAandB {
    public static int product(int a, int b){
        int pro = a*b;
        return pro;
    } 
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int prod= product(a, b);
        System.out.println(prod);
        sc.close();
    }
}
