public class sumOfAllDigit{
    public static void main(String[] args){
        int num = Integer.parseInt(args[0]);
        int n,i,sum=0;
        for(i=num;i>0;i=i/10){
            // System.out.println(i);
            n = num%10;
            sum +=n;
            num/=10;
        }
        System.out.println(sum);
    }
}