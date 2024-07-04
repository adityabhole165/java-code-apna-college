public class charPaattern {
    public static void main(String[] args) {
        int n=4;
        char ch = 'A';
        for(int i=1;i<=n;i++){
            for(int s=1;s<=i;s++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
