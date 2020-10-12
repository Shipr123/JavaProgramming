// Collection - ArrayList object
package Collection.ArrayList;

import java.util.Iterator;
import java.util.ArrayList;

public class CollectionArrayList
{
	public static void main(String args[])
	{
		ArrayList l1 = new ArrayList();  //Non Genric
		ArrayList l2 = new ArrayList();  //Non Genric
		ArrayList<Integer> l3 = new ArrayList<Integer>();  // Generic (defined the particular data type)
		l3.add(9);
		
		l1.add("Krishan");
		l2.add("Arora");
		l1.add("Arun");
		l1.add("pop");
		l1.addAll(1,l2);  		// adding new array in the specified index
		l1.set(1, "Kumar");  	// set method will replace the specified position and add new element
//		l1.subList(1, 1);
//		l1.get(1);
		
		System.out.println(l1.size());  //size of array list
		System.out.println(l1.get(2));
		
		
		
		// to print all the values from arraylist;
		// 1. for loop
		// 2. Iterator
		for(int i=0; i<l1.size(); i++)
		{
			//System.out.println(l1);
			System.out.println("L1 Array :"+l1.get(i));
		}
		
		///iterator
		
		Iterator it = (Iterator) l1.iterator();
		while(((java.util.Iterator) it).hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("// ************* //");
//   *************  //
		
		//Adding one object into another
		// addAll()
		ArrayList<String> ar5 = new ArrayList<String>();
		ar5.add("Dev");
		ar5.add("Ops");
		ar5.add("Sales");
		
		ArrayList<String> ar6 = new ArrayList<String>();
		ar6.add("Devops");
		ar6.add("OPERATION");
		ar6.add("Sales Team");
		
		ar5.addAll(ar6);
		
		for(int i=0; i<ar5.size(); i++)
		{
			System.out.println(ar5.get(i));
		}
		
//   *************  //
		
		System.out.println("// ************* //");
		//removeAll();
		ar5.removeAll(ar6);
		for(int i=0; i<ar5.size(); i++)
		{
			System.out.println(ar5.get(i));
		}
		
//   *************  //
		System.out.println("// ************* //");
		//retainAll();
		ArrayList<String> ar7 = new ArrayList<String>();
		ar7.add("test");
		ar7.add("non");
		ar7.add("break");
		
		ArrayList<String> ar8 = new ArrayList<String>();
		ar8.add("test");
		ar8.add("Globe");
		ar8.add("break");
		
		ar7.retainAll(ar8);
		for(int i=0; i<ar7.size(); i++)
		{
			System.out.println(ar7.get(i));
		}
	}
}