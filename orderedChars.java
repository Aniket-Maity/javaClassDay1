public class orderedChars{
    public static void main(String[] args){
        if((int)args[0].charAt(0)>(int)args[1].charAt(0)){
            System.out.println(args[1]+','+args[0]);
        }
        else{
            System.out.println(args[0]+','+args[1]);
        }
    }
}