import java.util.*;
public class oneton {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter value for 1 to n ");
        int n= sc.nextInt();
        int count =1;
        while (count<=n) {
            System.out.println(count);
            count++;
        }
        sc.close();
    }
}
