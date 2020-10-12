// How to Store user define class object intoArray list?

package Collection.ArrayList;

import java.util.Iterator;
import java.util.ArrayList;

public class ArrayList_object {
	public static void main(String args[])
	{
		// Creating Employee class Object
				Employee e1 = new Employee("Krishan", 22, "Software Engineer");
				Employee e2 = new Employee("Smash", 24, "QA");
				Employee e3 = new Employee("Arun", 23, "DevOps");
				
//				to use this Employee object in Arraylist, need to create a genric arraylist as Employee type
//				Create arraylist;
				ArrayList<Employee> arE = new ArrayList<Employee>();
				
				arE.add(e1);
				arE.add(e2);
				arE.add(e3);
				
				// iterator to traverse(print) the value
				Iterator <Employee> itt =  arE.iterator();
				while(itt.hasNext()) {
					Employee emp = itt.next();
					System.out.println(emp.name);
					System.out.println(emp.age);
					System.out.println(emp.dept);
					
				}
	}
}


//Output
Krishan 22 Software Engineer
Smash 24 QA
Arun 23 DevOps
