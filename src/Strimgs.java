
public class Strimgs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//two ways to create string
		//first way
		String s="Hello world tour";
		//second way
		String s1 = new String("Welcome");
		
		String[] splittedstring = s.split("world");
		System.out.println(splittedstring[1]);
		
		//characters of array
		for(int i=0; i<s.length(); i++)
		{
			System.out.println(s.charAt(i));
		}
		
		//Reverse order
		for(int i=s.length()-1; i>=0; i--)
		{
			System.out.println(s.charAt(i));
		}

	}

}
