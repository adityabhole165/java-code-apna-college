import java . util.*;
public class palindrome {
    public static void main(String[] args) {
        System.out.println("input a number ");
        Scanner sc = new Scanner(System.in);
        int palindrome = sc.nextInt();
        if(isPalindrome(palindrome)){
            System.out.println("number "+palindrome +" is a palindrome ");
        }else{
            System.out.println("number "+palindrome +" is not  a palindrome ");
        }
        sc.close();
    }
    public static boolean  isPalindrome(int number ){
        int palindrom = number ;
        int reverse=0;
        while(palindrom!=0){
            int remainder =palindrom %10;
            reverse = reverse*10+remainder;
            palindrom/=10;
        }
        if(number == reverse){
            return true;
        }
        return false;
    }
}
