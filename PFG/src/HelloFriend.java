public class HelloFriend {
	private String name;
	public void setName(String n) {
		name = n;
	}
	public String getName() {
		return name;
	}
	public static void main(String args[]) {
		HelloFriend javaClassExample = new HelloFriend();
		System.out.println("Hello " + javaClassExample.getName());
	}
}