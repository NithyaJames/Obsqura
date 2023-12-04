package collectionpkg;

import java.util.ArrayList;
import java.util.Iterator;

public class ColorsCollection {

	public static void main(String[] args) {
		ArrayList<String> cr=new ArrayList();
		cr.add("White");
		cr.add("Black");
		cr.add("Blue");
		cr.add("Red");
		System.out.println(cr);
		System.out.println("\nElement at specific index: "+cr.get(2));
		System.out.println("\nIterating through all elements");
		Iterator it=cr.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("\nRemoving 3rd item from array list");
		cr.remove(2);
		System.out.println(cr);
		if(cr.contains("Red")) {
			System.out.println("\nElement found");
		}
		else {
			System.out.println("\nElement not found");
		}

	}

}
