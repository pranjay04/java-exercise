import java.util.Scanner;

class apples {
	public static void main(String[] args){
		System.out.print("Please Enter your name - ");
		Scanner user_input = new Scanner(System.in);
		String name = user_input.nextLine();
		tuna tunaObject = new tuna();
		tunaObject.setName(name);
		tunaObject.saying();
	}
}
