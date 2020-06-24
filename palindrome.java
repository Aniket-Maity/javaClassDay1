public class palindrome{
    public static void main(String[] args){
        if(args.length!=1){
            System.out.print("Please enter an integer number");
            return;
        }
        int num = Integer.parseInt(args[0]);
        int varNum = num;
        int reversed = 0;
        while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        if(varNum==reversed){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
        
    }
}