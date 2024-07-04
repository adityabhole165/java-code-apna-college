import java.util.*;
public class pa {
    public static void main(String[] args) {
        System.out.println("imput a number");
        Scanner sc= new Scanner( System.in);
        int num= sc.nextInt();
        if(isPalin(num)){
            System.out.println(num +"it is palindroeme");
        }else{
                 System.out.println(num +"it is not  palindroeme");
        }
        sc.close();
    }
    public static boolean isPalin(int number){
        int palindro= number ;
        int reverse=0;
        while (palindro!=0) {
            int remaind = palindro%10;
            reverse = reverse*10+remaind;
            palindro= palindro/10;
            
        }
        if (number==reverse) {
            return true;
            
        }
        return false;
    }
}
