import java . util. Scanner;
public class pos_neg{
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int x= sc.nextInt();
    if(x>0)
    {
        System.out.println("number is greater than zero");
        
    }
    else
    {
        System.out.println("the number is less than zero");
    }
        sc.close();
}

}
