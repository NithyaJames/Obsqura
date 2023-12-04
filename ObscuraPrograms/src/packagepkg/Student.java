package packagepkg;

import java.util.ArrayList;
import java.util.Iterator;

public class Student {

	public static void main(String[] args) {
		ArrayList std=new ArrayList();
		std.add(121);
		std.add("Nithya");
		std.add(34);
		Iterator it=std.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
