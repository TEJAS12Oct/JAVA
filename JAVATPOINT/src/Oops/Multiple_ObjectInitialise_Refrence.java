package Oops;

class TestStudent3{
int id;
String Name;
}
      class Multiple_ObjectInitialise_Refrence {

	  public static void main(String[] args) {
		  //Creating objects  
		  Student s1=new Student();  
		  Student s2=new Student();  
		  //Initializing objects  
		  s1.id= 1;
		  s1.name="Tejas";  
		  s2.id=2;  
		  s2.name="Jawale";  
		  //Printing data  
		  System.out.println(s1.id+" "+s1.name);  
		  System.out.println(s2.id+" "+s2.name);  
		
	}

}
