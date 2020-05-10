import java.util.Scanner;

class wolf{
  public static void main(String[] args){
    System.out.println("Enter a number = ");
    Scanner user_input = new Scanner(System.in);
    int end = user_input.nextInt(), count = 0;
    while(count < end){
      System.out.print("Wolf howl ");
      System.out.println(count);
      count++;
    }
  }
}
