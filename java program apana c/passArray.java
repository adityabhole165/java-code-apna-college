public class passArray {
    public static void update(int m[]){
        for(int i=0;i<m.length;i++){
            m[i]=m[i]+1;
        }
    }
    public static void main(String[] args) {
        int marks[]={97,98,99};
        update(marks);
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]+" ");
        }
        System.out.println();
    }
}
