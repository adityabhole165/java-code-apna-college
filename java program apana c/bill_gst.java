import java.util.Scanner;

public class bill_gst {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float pencil= sc.nextFloat();
        float pen=sc.nextFloat();
        float eraser=sc.nextFloat();
        float total=pencil+pen+eraser;
        System.out.println("bill  "+total);
        //add with gst
        float newtotal=total+(0.18f*total);
        System.out.println("bill with 18% gst=  "+newtotal );
        sc.close();
    }
}
