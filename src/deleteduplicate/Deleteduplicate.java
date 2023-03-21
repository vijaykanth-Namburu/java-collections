package deleteduplicate;


import java.util.Iterator;
import java.util.LinkedHashSet;

public class Deleteduplicate {
	public static void main(String args[]) {
		
		LinkedHashSet<Integer> hs = new LinkedHashSet<Integer>();
		hs.add(3);
		hs.add(13);
		hs.add(17);
		hs.add(3);
		hs.add(45);
		hs.add(3);
		Iterator<Integer> it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		
		
	}

}
}
