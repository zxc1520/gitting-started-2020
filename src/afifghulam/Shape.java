import java.util.*;

class Shapes {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int num, num2, row, col, selection;
	
	//Menus
    System.out.println("==============================");
    System.out.println("\tCreate your own shape");
    System.out.println("==============================");
    System.out.println("1. Square");
    System.out.println("2. Triangle");
    System.out.println("3. Number Triangle");
    System.out.println("4. Info");
    System.out.print("Your option: ");
    selection = scan.nextInt();
    System.out.println("------------------------------");

    switch(selection) {

      case 1:
        System.out.print("Input Row: ");
        row = scan.nextInt();

        System.out.print("Input Column: ");
        col = scan.nextInt();

        for(int i=0; i < row; i++) {
          for(int j=0; j < col; j++) {
            System.out.print("* ");
          }
          System.out.print("\n");
        }
        break;

      case 2:
        System.out.print("input your number: ");
        num = scan.nextInt();

        for(int i=0; i<num; i++) {
          for(int j=0; j<num; j++) {
            System.out.print("* ");
            if(i==j) break;
          }
          System.out.print("\n");
        }
        break;

        case 3:
          System.out.print("Input your number: ");
          num2 = scan.nextInt();

          for(int i=0; i<= num2; i++) {
            for(int j=num2; j >=1; j--) {
              if(j>i) {
                System.out.print(" ");
              } else {
                System.out.print(i - j + 1);
              }
            }

            System.out.println();

          }
          break;

          case 4:
            System.out.println("=====INFORMATION=====");
            System.out.println("1. Created by Me");
            System.out.println("2. On 28th October");
            break;

      default: 
        System.out.println("Input option mismatch !");
        
    }

  }
}