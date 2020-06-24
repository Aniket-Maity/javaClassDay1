public class printEvensInRange{
    public static void main(String[] args){
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        for(num1= num1;num1<num2;num1++){
            if(num1%2==0){
                System.out.println(num1);
            }
        }
    }
}