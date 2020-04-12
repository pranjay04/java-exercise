import java.util.Scanner;

class orange{
    public static void main(String[] args){
        double num1, num2, total;
        System.out.print("Enter first number here = ");
        Scanner user_input = new Scanner(System.in);
        num1 = user_input.nextDouble();
        System.out.print("Enter second number to add = ");
        num2 = user_input.nextDouble();
        total = num1 + num2;
        System.out.println("The sum of two entered numbers are = " + total);
    }
}
