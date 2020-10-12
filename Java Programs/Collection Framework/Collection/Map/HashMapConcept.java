package Collection.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapConcept {
	public static void main(String args[])
	{
		//Hash map extend abstract map class
		// implement map Interface
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Devops");
		hm.put(2, "QA");
		hm.put(3, "VC");
		hm.put(4, "Founder");
		
		//get()
//		System.out.println(hm.get(2));
		
		//to iterate hash map (Print all the values)
		//forloop
		for(int i=0; i<hm.size(); i++)
		{
			System.out.println(hm.get(i));
		}
		
		//entry map
		for(Entry m : hm.entrySet()) {
			System.out.println(m.getKey()+" "+ m.getValue());
		}
		
		//remove();
		hm.remove(4);   //it does not maintain the order
		System.out.println(hm);
		
		
	}
}
