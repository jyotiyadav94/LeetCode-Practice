package hashmap;

public class init_block {

	{
		System.out.println("first");
	}

	init_block()
	{
		System.out.println("second");
	}

	init_block(String name)
	{
		System.out.println("third");
	}	
	
public static void main(String[] args) {

new  init_block();
new init_block("jyoti");
}	
	
}
