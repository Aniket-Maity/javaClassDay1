public class printColor {
    public static void main(String[] args) {
  
      char inputColor = args[0].charAt(0);
      //R->Red, B->Blue, G->Green, O->Orange, Y->Yellow, W->White. 
      switch (inputColor) {
        case 'R':
            System.out.println("Red");
            break;
        case 'B':
            System.out.println("Blue");
            break;
        case 'G':
            System.out.println("Green");
            break;
        case 'O':
            System.out.println("Orange");
            break;
        case 'Y':
            System.out.println("Yellow");
            break;
        case 'W':
            System.out.println("White");
            break;
        default:
          System.out.println("Invalid Code");
          break;
      }
    }
  }