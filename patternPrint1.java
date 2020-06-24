public class patternPrint1{
    public static void main(String[] args){
        if(args.length!=1){
            System.out.print("Please enter an integer number");
            return;
        }
        int N = Integer.parseInt(args[0]);
        for(int i=1;i<=N;i++){
            int j=i;
            while(j>0){
                System.out.print("*\t");
                j--;
            }
            System.out.print('\n');
        }
    }
}