public class linearSearch {
    public static int linear(String menu[],String key){
        for(int i=0; i<menu.length  ;i++){
            if(menu[i]==key){
                return i;
            }
        
        } return -1;
    }
    public static void main(String[] args) {
        //int numbers[]={2,4,6,7, 8,10,12};
        //int key =1;
        String menu[]= { "dosa","chole bature","Samosa"};
        String key="idali";
        int index=linear(menu,key);
        if(index==-1){
            System.out.println("number not found");
        }else{
            System.out.println("key at index "+ index);
        }
    }
}
