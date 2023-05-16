
public class VariablesandDataTypes {

	public static void main(String[] args) {
		
		int num=5;
		String text="Hello World";
		char letter='r';
		double dec= 67.23;
		boolean result=true;
		System.out.println(num);
		System.out.println(text);
		System.out.println(dec);
		System.out.println(letter);
		System.out.println(result);
		
		//Array
		//one way
		int[] arr1=new int[5];
		arr1[0]=21;
		arr1[1]=32;
		arr1[2]=44;
		arr1[3]=65;
		arr1[4]=87;
		
		//another way
		int[] arr2= {1,2,3,4,5};
		System.out.println(arr2[2]);
		
		//for loop arr1.lenght is 5
	//	for(int i=0; i<arr1.length; i++)
	//	{
	//		System.out.println(arr1[i]);
	//	}
		//for loop arr2.lenght is 5
		for(int i=0; i<arr2.length; i++)
		{
			System.out.println(arr2[i]);
		}
		// string array
		String[] name= {"vino","vidhya","vivi"};
		for(int i=0; i<name.length; i++) {
			System.out.println(name[i]);
		}
		
		//enhanced for loop
		for(String s:name)
		{
			System.out.println(s);
		}
		
	}

}
