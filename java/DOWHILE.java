public class DOWHILE {
    public static void main(String[] args){
        int j = 0;
        do{
            j++;
            System.out.println(j);
            if (j>20){
                break;
            }
        }while(true);
    }   
}