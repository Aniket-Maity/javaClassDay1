public class main1 {
  public static void main(String[] args) {
    // System.out.println("Hello World");

    // int x = Integer.parseInt(args[0]);
    // int y = Integer.parseInt(args[1]);
    // int sum = 0;
    // sum = x + y;
    // System.out.println(sum);

    char grade = args[0].charAt(0);
    switch (grade) {
      case 'A':
        System.out.println("your grade is "+ grade);
        break;
      case 'B':
        System.out.println("your grade is "+ grade);
        break;
      case 'C':
        System.out.println("your grade is "+ grade);
        break;
      default:
        System.out.println("invalid!!");
        break;
    }
  }
}