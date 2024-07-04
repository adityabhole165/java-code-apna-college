public class diffDatatypeFunOverloading {
    public static int add(int a,int b){
        return a+b;
    }
    public static float add(float z,float y){
        return z+y;
    }
    public static void main(String[] args) {
    System.out.println("sum="+add(3,5));
    System.out.println("sum="+add(3.2f,4.8f));
    
    
    }
}
