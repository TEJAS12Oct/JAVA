package Constructor;//overloaded With Constructor

public class Student {
	 int id;
	 String name;

	 Student(int i,String n){
		 id=i;
		 name =n;
	 }
	 
	 Student(Student T){
		 id = T.id;  
		 name =T.name;
	 }



	
	void display() {
		System.out.println(id +" "+ name);
	}
	public static void main(String[] args) {
		Student s1 = new Student(12,"Tejas");
		Student s2 = new Student(10,"Jawale");
		s1.display();
		s2.display();
		
	}

}
