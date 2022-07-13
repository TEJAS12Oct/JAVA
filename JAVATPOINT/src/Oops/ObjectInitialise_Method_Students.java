package Oops;

class TestStudent4{  
	 int rollno;  
	 String name;  
	
	 void insertRecord(int r, String n){  
	  rollno=r;  
	  name=n;  
	 }  
	 void displayInformation(){System.out.println(rollno+" "+name);}  
	}  
	
public class ObjectInitialise_Method_Students {

	public static void main(String[] args) {
		TestStudent4 s1=new TestStudent4();  
		TestStudent4 s2=new TestStudent4();  
		  s1.insertRecord(1210,"Tejas");  
		  s2.insertRecord(1299,"Jawale");  
		  s1.displayInformation();  
		  s2.displayInformation();
	}

}
