package package1;

public class ThisCurrentConstructor {

		    int id;
			String name;

			ThisCurrentConstructor() {
				this(1,"Nisha");
				System.out.println("Default Constructor");
								
			}

			ThisCurrentConstructor(int id1, String name1) {
				this.id = id1;
				this.name = name1;
				System.out.println("Parameterized Constructor");
				
				
			}

			

			void display() {
				System.out.println(id);
				System.out.println(name);

			}

			void display1() {
				this.display();

			}
			public static void main(String args[]) {
				ThisCurrentConstructor obj = new ThisCurrentConstructor();
				obj.display1();
							}
		}
		



