public class HelloFriend {
	private String name;
	public void setName(String n) {
		name = n;
	}
	public String getName() {
		return name;
	}
	public static void main(String args[]) {
		HelloFriend javaClassExample = new HelloFriend(); //creating an object
		javaClassExample.setName("Brie Vlad Alexandru - baiatul meu!!!"); // the object receives a value -> name=Brie Vlad Alexandru
		System.out.println("Hello " + javaClassExample.getName()); //returns the value received at previous step
	}
}