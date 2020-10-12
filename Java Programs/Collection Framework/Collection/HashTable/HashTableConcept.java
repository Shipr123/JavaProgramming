package Collection.HashTable;
import java.util.Hashtable;
import java.util.Enumeration;
import java.util.Set;
public class HashTableConcept {
	public static void main(String args[])  //it is synchronised
	{
		Hashtable<Integer, String> h1 = new Hashtable<Integer, String>();
		h1.put(1, "Tom");
		h1.put(2, "Jerry");
		h1.put(3, "Monk");
		
		//Create a clone copy of Hash table
		
		Hashtable<Integer, String> h2 = new Hashtable<Integer, String>();
		
		h2 = (Hashtable)h1.clone();
		
		System.out.println("The Hashtable Value" +h1);
		System.out.println("The Hashtable Value" +h2);
		
		//clear
		h1.clear();
		System.out.println("The Hashtable Value" +h1);
		
		//contain value
		Hashtable st = new Hashtable();
		st.put("A", "Rock");
		st.put("B", "Mac");
		st.put("C", "John");
		
	if(st.containsValue("Rock"))
		System.out.println("True");
	
		//Iterate (Print) value of Hash Table -- using Enumeration -- elements()
		Enumeration e = st.elements();
		System.out.println("Print values from st using Enumeration");
		
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		
		//Iterate (Print) value of Hash Table -- using entrySet() -- 
		System.out.println("Print values from st using entry set");
		Set s = st.entrySet();
		System.out.println(s);
		
		
		//Both Hash table objects are equal or not
		Hashtable st1 = new Hashtable();
		st1.put("A", "Rock");
		st1.put("B", "Mac");
		st1.put("C", "John");  // it contains only Unique value
		
		if(st.equals(st1))
		{
			System.out.println("Both are equal");
		}
		
		//get the value from a key:
		System.out.println(st1.get("A"));
		
		//get the hash code of hash object
		System.out.println("The hash code value of st1 :"+st1.hashCode());
	}
}
