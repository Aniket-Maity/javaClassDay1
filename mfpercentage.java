public class mfpercentage {
    public static void main(String[] args){
        int value = Integer.parseInt(args[1]);
        boolean flag = 1<=value && value<=58;
        
        String male = new String("Male");
        String female = new String("Female");
        if((args[0].equals(male)) && (flag==true)){
            System.out.println("If the gender is 'Male' and age is between 1 and 58, the percentage of interest is 8.4%.");
        }
        else if((args[0].equals(male)) && flag==false){
            System.out.println("If the gender is 'Male' and age is between 59 and 100, the percentage of interest is 10.5%.");
        }
        else if((args[0].equals(female)) && flag==false){
            System.out.println("If the gender is 'Female' and age is between 59 and 100, the percentage of interest is 9.2%.");
        }
        else{
            System.out.println("If the gender is 'Female' and age is between 1 and 58, the percentage of interest is 8.2%.");
        }
    }
}