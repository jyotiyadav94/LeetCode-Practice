package hashmap;

public class init_2 {

	{
		System.out.println("first block");
	}
	
	init_2()
	{
		System.out.println("second");
	}
	
	init_2(String name)
	{
		System.out.println("third");
	}
	
	{
		System.out.println("fourth");
	}
public static void main(String[] args) {
	
new init_2();
new init_2("jyoti");
}	
	
}
