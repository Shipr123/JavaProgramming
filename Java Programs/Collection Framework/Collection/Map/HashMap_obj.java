//Store user define class object into HashMap
package Collection.Map;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMap_obj {
	public static void main(String args[])
	{
		// Creating Employees class Object
		Employees e1 = new Employees("Krishan", 22, "Software Engineer");
		Employees e2 = new Employees("Smash", 24, "QA");
		Employees e3 = new Employees("Arun", 23, "DevOps");
		
		HashMap<Integer, Employees> emp = new HashMap<Integer, Employees>();
		
//		assign the object value to emp
		emp.put(1, e1);
		emp.put(2, e2);
		emp.put(3, e3);
		
		//Traverse the Hash Map (Print)
		for(Entry<Integer, Employees> m : emp.entrySet()) {
			int Key = m.getKey();
			Employees e = m.getValue();
			System.out.println("Employees "+ Key +" "+ "info :");
			System.out.println(e.name +" "+ e.age +" "+ e.dept);
			
		}
		
	}
}

//output
Employees 1 info :
Krishan 22 Software Engineer
Employees 2 info :
Smash 24 QA
Employees 3 info :
Arun 23 DevOps
