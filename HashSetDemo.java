//Java program to demonstrate HashSet class

package Demo4;

import java.util.HashSet;
import java.util.Iterator;
public class HashSetDemo{

	public static void main(String[] args) {
	HashSet<String> set= new HashSet<String>();
	
	//Data is not added through Indexing approach
	//There are Hash codes for elements which are being added
	set.add("John");
	set.add("Bob");
	set.add("Victor");
	set.add("Bob"); //A Set cannot contain duplicate elements 
	
	//Data is unique, no redundancy
	//Data is unordered in output due to hashing
	System.out.println("Set is:"+set);
	
	Iterator<String> itr=set.iterator();
	
	while(itr.hasNext())
	{
		String str=itr.next();
		System.out.println(str);
		}
	
	set.remove("Victor");
	
	System.out.println("After removing Victor, the Set is:"+set);
	System.out.println("Check if an element is present in the set");
	if(set.contains("John"))
	
		System.out.println("John is in the set");
		System.out.println("Set size is "+set.size());
		
	}
	
}

