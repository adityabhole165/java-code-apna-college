

public class binomialCoefficient{
    public static int facto(int n){
        int fact=1;
        for(int i =1; i<=n;i++){
            fact*=i;
        }
        return fact;
    }
    public static int binCoff(int n,int r){
        int n_fact=facto(n);
        int r_fact=facto(r);
        int nmr_fact=facto(n-r);

        int binCo=n_fact/(r_fact*nmr_fact);
        return binCo;
    }
    public static void main(String[] args) {
        System.out.println("binary coefficient =  "+ binCoff(5, 2));
    }

}