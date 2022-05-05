package keywords;

class Student6{  
int rollno;  
String name;  
float fee;  
Student6(int rollno,String name,float fee){  
this.rollno=rollno;  
this.name=name;  
this.fee=fee;  
}  
void display(){System.out.println(rollno+" "+name+" "+fee);}  
}  
public class ThisKw {

	public static void main(String[] args) {
		Student6 s1=new Student6(111,"ankit",5000f);  
		Student6 s2=new Student6(112,"sumit",6000f);  
		s1.display();  
		s2.display();  
		
	}

}
