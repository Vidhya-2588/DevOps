
public class MethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodDemo d = new MethodDemo();
		String name = d.getData();
		System.out.println(name);
		childclass d1 = new childclass();
		d1.getUserData();
		getData1();

	}
	public String getData() {
		System.out.println("Hello World");
		return "Vidhya";
	}
	public static String getData1() {
		System.out.println("Hello World");
		return "Vidhya";
	}
}
