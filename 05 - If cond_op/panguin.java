import java.util.Scanner;

class titanic{
  public static void main(String[] args){
    int number;
    System.out.print("Enter a number over here from 1 to 10 = ");
    Scanner user_input = new Scanner(System.in);
    number = user_input.nextInt();
    if(number > 5){
      System.out.println("The entered number is greater than 5");
    }
    else if (number == 5){
      System.out.println("The entered number is equal to 5");
    }
    else{
      System.out.println("The entered number is smaller than 5");
    }

    if((number > 5) && (number%5 == 0)){
        System.out.println("The entered number is greater than 5 and is multiple of 5");
    }
    else if (number < 5 || number == 19){
        System.out.println("The entered number is either smaller than 5 or equal to 19");
    }else{
      System.out.println("else statement");
    }
    }
}
