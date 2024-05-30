package hashmap;

public class constructor_chaining {

String name;

constructor_chaining()
{
	this(" ");
	System.out.println("//constrcutor 1- No-argument constructr of base class");
}
constructor_chaining(String name)
{
	this.name=name;
	System.out.println("constrcutor 2- calling parameterized constructor");
}

class derived extends constructor_chaining
{
	derived()
	{
		//super(name);
		System.out.println("constrcutor 3- parameterised ");
	}
	
derived(String name)
{
	super(name);
	System.out.println("constrcutor 4 - called");
}

}
public static void main(String[] args) {

////	derived x=new derived("test")y
//	derived z=new derived("test");
	
}
}

