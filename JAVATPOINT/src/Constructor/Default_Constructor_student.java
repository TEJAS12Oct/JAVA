package Constructor;

public class Default_Constructor_student {
	int id;  
	String name;  
	//method to display the value of id and name  
	void display(){System.out.println(id+" "+name);}  
	  
	public static void main(String args[]){  
	//creating objects  
		Default_Constructor_student s1=new Default_Constructor_student();  
		Default_Constructor_student s2=new Default_Constructor_student();  
	//displaying values of the object  
	s1.display();  
	s2.display();  
	}  
	}  
