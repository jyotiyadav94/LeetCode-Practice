package hashmap;

import java.security.KeyStore.Entry;
import java.util.HashMap;

public class hashmap1 {

	public static void main(String[] args) {
		
HashMap <Integer,String> map=new HashMap<Integer,String>();
map.put(1, "jyoti");
map.put(2,"priya");
map.put(3,"shubham");
//System.out.println(map.get(1));
//System.out.println(map.get(2));
//System.out.println(map.get(3));
System.out.println(map);
for(java.util.Map.Entry<Integer, String> m:map.entrySet())
{
	System.out.println(m.getKey());
}

map.remove(3);
System.out.println(map);

	}
	
}
