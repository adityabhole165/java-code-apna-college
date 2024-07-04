import java.util.*;
public class CheckEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("input a number ");
        num = sc.nextInt();
        if (isEven(num)) {
            System.out.println(num +" "+ "number is even ");
        } else {
            System.out.println(num +" "+ "number is odd ");
        }
        sc.close();
    }
    public static boolean isEven(int num ){
        if(num%2==0){
            return true;
        }else{
            return false;
        }
    }
}
