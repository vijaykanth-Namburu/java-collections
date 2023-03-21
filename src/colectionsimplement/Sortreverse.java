package colectionsimplement;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Sortreverse{
	

	public static void main(String args[]) {
	
		
		LinkedList<Integer> ln = new LinkedList<Integer>();
		ln.add(89);
		ln.add(90);
		ln.add(30);
		ln.add(22);
		Iterator<Integer> it = ln.iterator();
		System.out.println("The elements are: ");
		while(it.hasNext()) {
			System.out.println(it.next());
	}
		System.out.println("After sorting elements:");
		Collections.sort(ln);
		it = ln.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
	}
		System.out.println("After reversing the elements are:");
		LinkedList<Integer> list = new LinkedList<Integer>();
		int i= ln.size();
		for(i=ln.size()-1;i>=0;i--){
			list.add(ln.get(i));
		}
		it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
	}
		System.out.println("After listiterator the elements are:");
		it = ln.listIterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
		
}
}