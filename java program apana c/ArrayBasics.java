import java.util.*;
public class ArrayBasics {
    // Creating array
    public static void main(String[] args) {
        int marks[] = new int[50];
        Scanner sc = new Scanner(System.in);
        marks[0]=sc.nextInt();
        marks[1]= sc.nextInt();
        marks[2]= sc.nextInt();
        System.out.println("marks 1 ="+ marks[0]);
        System.out.println("marks 2 ="+ marks[1]);
        System.out.println("marks 3 ="+ marks[2]); 
        int per = (marks[0]+marks[1]+marks[2])/3;
        System.out.println(" percentage "+ per );
        sc.close();
        int mark[] =new int[500];
        int ma[]= new int [30];
        int ab[]= new int [100];
        System.out.println("length of array "+ ma.length);
        System.out.println("length of array ab"+ab.length);
        System.out.println("length of array "+ mark.length);
    }
    
}
