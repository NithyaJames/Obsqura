package arraylistpackage;
import java.util.*;


public class ArrayListEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList ar=new ArrayList();
		ar.add("Hello");
		ar.add(1);
		ar.add("Nithya");
		System.out.println(ar);
		System.out.println("Size of arraylist: "+ar.size());
		ArrayList a=new ArrayList();
		a.add("Hi");
		a.add(2);
		a.add(3);
		System.out.println(a);
		System.out.println("Size of second arraylist: "+a.size());
		ar.addAll(a);
		System.out.println(ar);
		ar.remove(1);
		System.out.println(ar);
		ar.remove("Nithya");
		System.out.println(ar);
		Iterator it=ar.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
		


	}

}
