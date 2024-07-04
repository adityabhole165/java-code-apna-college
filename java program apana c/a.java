public class a {
    public static void main(String[] args) {
        int a= 299301;
        int rev=0;
        while (a>0) {
            int last= a %10;
            a/=10;
            rev=(rev*10)+last;
        }
        System.out.println(rev);
        }
    }

