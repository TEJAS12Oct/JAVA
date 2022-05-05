package Constructor;

public class Constuctor_Overloading_Student {
	  int id;  
	    String name;  
	    int age;  
	    //creating two arg constructor  
	    Constuctor_Overloading_Student(int i,String n){  
	    id = i;  
	    name = n;  
	    }  
	    //creating three arg constructor  
	    Constuctor_Overloading_Student(int i,String n,int a){  
	    id = i;  
	    name = n;  
	    age=a;  
	    }  
	    void display(){System.out.println(id+" "+name+" "+age);}  
	   
	    public static void main(String args[]){  
	    Constuctor_Overloading_Student s1 = new Constuctor_Overloading_Student(12,"Tejas");  
	    Constuctor_Overloading_Student s2 = new Constuctor_Overloading_Student(10,"Jawale",22);  
	    s1.display();  
	    s2.display();  
	   } 

}
