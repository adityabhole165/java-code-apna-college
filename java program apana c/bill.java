import java.util.*;

class bill{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter value of pencil");
        int pencil=sc.nextInt();
        System.out.println("enter value of pen");
        int pen = sc.nextInt();
        System.out.println("enter value of eraser");
        int eraser=sc.nextInt();
        int bill=pen+pencil+eraser;
        System.out.println("bill  "+bill);
        sc.close();

    }
}