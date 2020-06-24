public class printNumForLoop{
    public static void main(String[] args){
        int inputN = Integer.parseInt(args[0]);
        for(int i=0;i<inputN;i++){
            System.out.print(i+1);
            if(i<inputN-1){
                System.out.print('\t');
            }
        }
    }
}