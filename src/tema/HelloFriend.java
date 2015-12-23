package tema;

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
		javaClassExample.setName("trying to finish this god
damn assignment :)")
		System.out.println("Hello " + javaClassExample.getName());
	}
}
