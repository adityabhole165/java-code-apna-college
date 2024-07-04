import java.util.*;
public class searchingFun {
    public static boolean Search(int matrix[][],int key){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==key){
                    System.out.print("found at cell (" +i+","+j+")");
                    return true;
                }
            }
        }
        System.out.print("key not found");
        return false;
    }
    public static void main(String[] args) {
        int matrix[][]=new int[3][3];
        int n= matrix.length;
        int m=matrix[0].length;
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        Search(matrix, 5);
    }
}
// public class searchingFun {
//         public static boolean Search(int matrix[][]){
//            int m= number[0][0];

//             for(int i=0;i<matrix.length;i++){
//                 for(int j=0;j<matrix[0].length;j++){
//                     if(matrix[i][j]>m){
//                         System.out.print("max at cell (" +i+","+j+")  " + m);
//                         return true;
//                     }
//                 }
//             }
            // System.out.print("key not found");
            // return false;
    //     }
    //     public static void main(String[] args) {
    //         int matrix[][]=new int[3][3];
    //         int n= matrix.length;
    //         int m=matrix[0].length;
    //         Scanner sc= new Scanner(System.in);
    //         for(int i=0;i<m;i++){
    //             for(int j=0;j<n;j++){
    //                 matrix[i][j]=sc.nextInt();
    //             }
    //         }
    //         Search(matrix);
    //     }
    // }