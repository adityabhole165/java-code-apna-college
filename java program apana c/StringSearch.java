public class  StringSearch{
    public static int linear(String menu[],String key){
        for(int i=0; i<menu.length  ;i++){
            if(menu[i]==key){
                return i;
            }
        
        } return -1;
    }
    public static void main(String[] args) {
        String menu[]= { "dosa","chole bature","Samosa"};
        String key="Samosa";
        int index=linear(menu,key);
        if(index==-1){
            System.out.println("number not found");
        }else{
            System.out.println("key at index "+ index);
        }
    }
}