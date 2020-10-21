//Java Program to demonstrate Linked List

package Demo4;

import java.util.LinkedList;
public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList <String> l1=new LinkedList<String>();
		
		l1.add("Bob");
		l1.add("David");
		l1.add("George");
		System.out.println("Linked List 1 :"+l1);
		l1.addFirst("Alice");
		System.out.println("Linked List 1 after adding an element at the beginning of the list:"+l1);
		l1.addLast("Zen");
		System.out.println("Linked List 1 after adding an element towards the end of the list:"+l1);
		l1.remove(0);
		System.out.println("Linked List 1 after removing an element at the 0th location:"+l1);
		System.out.println("Size of Linked List 1 :"+l1.size());
		
		LinkedList <String> l2=new LinkedList<String>();
		
		l2.add("Suzy");
		l2.add("Mark");
		l2.add(2,"Ricky");
		System.out.println("Linked List 2 :"+l2);
		l1.addAll(l2);
		System.out.println("Linked List 1 after invoking addAll(Collection<? extends E> c) method:"+l1);
		
		LinkedList <String> l3=new LinkedList<String>();
		l3.add("Jeny");
		l3.add("John");
		l3.add("Albert");
		l3.add("John");
		l3.add("Jeny");
		
		System.out.println("Linked List 3 :"+l3);
		System.out.println("Remove First occurance of an element in the Linked List 3 :"+l3.removeFirstOccurrence("Jeny"));
		System.out.println("Linked List 3"+l3);
		System.out.println("Remove Last occurance of an element in the Linked List 3 :"+l3.removeLastOccurrence("John"));
		System.out.println("Linked List 3"+l3);
		l3.clear();
		System.out.println("Linked List 3"+l3);
	
	}
}	
