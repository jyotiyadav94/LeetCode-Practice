package hashmap;

public class copy_constructor {

int a,n;

copy_constructor(int a,int n)
{ 	
	this.a=a;
	this.n=n;
	System.out.println(a);
	System.out.println(n);
}

copy_constructor(copy_constructor c)
{ 	
	a=c.a;
	n=c.n;
	
	System.out.println(a);
	System.out.println(n);
}	

public static void main(String[] args) {

	copy_constructor x=new copy_constructor(10,20);
	copy_constructor y=new copy_constructor(x);
	copy_constructor z=y;
	
	
}


}
