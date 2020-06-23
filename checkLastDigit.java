public class checkLastDigit{
    public static void main(String[] args){
        int firstNum = Integer.parseInt(args[0]);
        int secondNum = Integer.parseInt(args[1]);
        if(firstNum%10 == secondNum%10){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}