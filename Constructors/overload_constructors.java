package hashmap;

public class overload_constructors {

	overload_constructors(String name)
	{
		System.out.println("name");
	}
	overload_constructors(String name,int age)
	{
		System.out.println("name" +name+ " "+age);
	}

	overload_constructors(int id)	
	{
		System.out.println("id"+id);
	}
public static void main(String[] args) {

	overload_constructors x=new overload_constructors("jyoti");
	overload_constructors y=new overload_constructors("yadav",4);
	overload_constructors z=new overload_constructors(7);
	
	
}	
}
