public class tuna{
	private String owner_name;
	public void setName(String name){
		owner_name = name;
	}
	public String getName(){
		return owner_name;
		}
	public void saying(){
		System.out.printf("The name stored as owner is %s", getName());
	}
	// public void simpleMessage(String name){
	// 	System.out.println("This is tuna class and your name is " + name);
	// }
}
