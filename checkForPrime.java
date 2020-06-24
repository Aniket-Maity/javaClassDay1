public class checkForPrime{
    public static void main(String[] args){
        int InputNum = Integer.parseInt(args[0]);
        boolean flag = true;
        for(int i=2;i<=InputNum/2;++i){
            if(InputNum%i == 0){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }
    }
}