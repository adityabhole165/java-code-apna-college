import java .util.*; 
public class methodFindAvg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double avg = cal(a,b,c); 
        System.out.println("Average = "+avg);
        sc.close();
    }
    public static double cal(double a , double b,double c ){
        return((a+b+c)/3);
    }
    
}
