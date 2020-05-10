import java.util.Scanner;

class seagate {
  public static void main(String[] args){
    System.out.println("Please enter an option from 1 to 3");
    Scanner user_input = new Scanner(System.in);
    int selection = user_input.nextInt();
    switch(selection){
      case(1):
        System.out.println("You selected 1 = Pizza");
        break;
      case(2):
        System.out.println("You selected 2 = Berger");
        break;
      case(3):
        System.out.println("You selected 3 = Spagetti");
        break;
      default:
        System.out.println("You selected something else = Apple");
        break;
    }
  }
}
