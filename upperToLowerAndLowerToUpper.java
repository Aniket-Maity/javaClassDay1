public class upperToLowerAndLowerToUpper {
    public static void main(String[] args){

        char inputChar = args[0].charAt(0);
        int ascii = (int)inputChar;
        //System.out.println(ascii);
        if((65<=ascii && ascii<=90)){
            char newLowerToUpper = (char)(ascii+32);
            System.out.println(args[0]+"->"+newLowerToUpper);
        }
        else{
            char newUpperToLower = (char)(ascii-32);
            System.out.println(args[0]+"->"+newUpperToLower);
        }
    }
}