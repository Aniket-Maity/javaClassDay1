public class checkDigitAlphaSpecial{
    public static void main(String[] args){
        char inputChar = args[0].charAt(0);
        int ascii = (int)inputChar;
        if((65<=ascii && ascii<=90) || ((97<=ascii && ascii<=122))){
            System.out.println("Alphabhet");
        }
        else if(48<=ascii && ascii<=57){
            System.out.println("Digit");
        }
        else{
            System.out.println("Special Character");
        }
    }
}