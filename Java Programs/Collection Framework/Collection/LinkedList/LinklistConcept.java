package Collection.LinkedList;

import java.util.LinkedList;
import java.util.Iterator;
public class LinklistConcept {
	
	public static void main(String args[])
	{
		LinkedList<String> li = new LinkedList<String>();  //Genric is defined<String>
		
		//add();
		li.add("Devops");
		li.add("Sales");
		li.add("QA");
		li.add("chief");
		li.add("Hr");
		
		//print
		System.out.println("LinkedList :" +li);
		
		//addfirst element
		li.addFirst("President");
		System.out.println("LinkedList :" +li);
		
		//addLast Element
		li.addLast("Associate");
		System.out.println("LinkedList :" +li);
		
		//get
		System.out.println(li.get(0));
		
		//set
		li.set(0, "Vice Presedint");
		System.out.println(li.get(0));
		
		//remove first and Last element
		li.removeFirst();
		li.removeLast();
		System.out.println("LinkedList :" +li);
		
		//Remove from a specific Position
		li.remove(0);
		
		//iterate or print the value of Linkedkist;
		//1. for loop
		System.out.println("**for loop**");
		for(int n=0; n<li.size(); n++)
		{
			System.out.println(li.get(n));
		}
		
		//2. advance for loop
		System.out.println("**advance for loop**");
		for(String str : li) {
			System.out.println(str);
		}
		
		//3. Iterator
		System.out.println("**iterator**");
		Iterator<String> it = li.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//3. while loop
		System.out.println("**while**");
		int num = 0;
		while(li.size()>num)
		{
			System.out.println(li.get(num));
			num++;
		}
		
	}
}
