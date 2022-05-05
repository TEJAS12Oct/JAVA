package Constructor;//overloaded Without Constructor

public class student1 {
	
		int id;
		String name;
	
	
	    student1(int i,String n){
		id=i;
		name=n;
	}
	
	student1(){}
		void display() {System.out.println(id +" "+ name);
	}
	

	public static void main(String[] args) {
		student1 t1 = new student1(12,"tej");
		student1 t2 = new student1();
		t2.id=t1.id;
		t2.name= t1.name;
		t1.display();
		t2.display();
		

	}

}
 