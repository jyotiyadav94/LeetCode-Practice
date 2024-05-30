package LeetCode30programsMay;
/***
 * 
 * Day3
 * Jewels and Stones problem
 * @author jyotiyadav
 *
 */
public class jewelsAndStones {
	
	public static int noofjeewels(String J,String S)
	{

		 int count=0;
		    
		        for(int i=0;i<J.length();i++){
		            for(int j=0;j<S.length();j++)
		            if(J.charAt(i)==S.charAt(j)){
		                count++;
		            }
		        }
		        System.out.println(count);
		        return count;
		       
		      
		}


	public static void main(String[] args) {
		
	String s="aAAbbbb";
	String j="aA";
	
	noofjeewels(s,j);
	
	
	
	
}
}
