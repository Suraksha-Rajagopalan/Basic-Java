public class CONTINUE {
    public static void main(String[] args){
        for (int i=1; i<20; i++){
            if(i%15==0 || i%3==0 || i%5==0){
                continue;
            }
            else{
                System.out.println(i);
            }
        }
    }
    
}
