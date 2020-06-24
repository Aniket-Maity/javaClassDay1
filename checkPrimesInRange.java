public class checkPrimesInRange{
    public static void main(String[] args){
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        for(num1 = num1;num1<num2;num1++){
            boolean flag = true;
            for(int i=2;i<=num1/2;++i){
                if(num1%i==0){
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.println(num1+" is prime");
            }
            // else{
            //     System.out.println(num1+" is not prime");
            // }
        }
    }
}