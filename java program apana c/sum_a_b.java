import java.util.*;

public class sum_a_b {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter 2 number");

        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println("sum= "+sum);
        sc.close();
    }
}
