import java.util.*;
public class TwoDArrays{
    public static void main(String[] args) {
        int Matrix[][]=new int[3][3];
        int n= Matrix.length;
        int m=Matrix[0].length;
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                Matrix[i][j]=sc.nextInt();
            }
        }
        //op
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.err.print(Matrix[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();

    }
}
