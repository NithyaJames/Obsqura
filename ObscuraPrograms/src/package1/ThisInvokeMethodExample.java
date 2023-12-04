package package1;

public class ThisInvokeMethodExample {
	    int id;
		String name;

		ThisInvokeMethodExample() {
		}

		ThisInvokeMethodExample(int id1, String name1) {
			this.id = id1;
			this.name = name1;
		}

		

		void display() {
			System.out.println(id);
			System.out.println(name);

		}

		void display1() {
			this.display();

		}
		public static void main(String args[]) {
			ThisInvokeMethodExample obj = new ThisInvokeMethodExample();
			obj.display1();
			ThisInvokeMethodExample obj1 = new ThisInvokeMethodExample(1, "Jiss");
			obj1.display1();

		}
	}
	

