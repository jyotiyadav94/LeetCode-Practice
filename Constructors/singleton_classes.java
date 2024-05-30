package hashmap;

public class singleton_classes {

static singleton_classes instance=null;
public int x=10;

public singleton_classes()
{
	int y = 20;
}

static public  singleton_classes getinstance()
{
	if(instance==null)
	{
		instance=new singleton_classes();
	}
return instance;	
}

public static void main(String[] args) {
	
	singleton_classes a=singleton_classes.getinstance();
	singleton_classes b=singleton_classes.getinstance();
	a.x=a.x+10;
	System.out.println("the value of "+a.x);
	System.out.println("the value of "+b.x);
	
}

}
