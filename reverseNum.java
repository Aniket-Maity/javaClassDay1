public class reverseNum{
    public static void main(String[] args){
        if(args.length!=1){
            System.out.print("Please enter an integer number");
            return;
        }
        int num = Integer.parseInt(args[0]);
        int reversed = 0;
        while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        System.out.println(reversed);
    }
}