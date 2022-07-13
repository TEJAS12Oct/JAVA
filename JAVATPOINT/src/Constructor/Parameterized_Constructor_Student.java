package Constructor;

 class Parameterized_Constructor_Student {
	  
	    int id;  
	    String name;  
	    //creating a parameterized constructor  
	    Parameterized_Constructor_Student(int i,String n){  
	    id = i;  
	    name = n;  
	    }  
	    //method to display the values  
	    void display(){System.out.println(id+" "+name);}  
	   
	    
	    public static void main(String args[]){  
	    //creating objects and passing values  
	    	Parameterized_Constructor_Student s1 = new Parameterized_Constructor_Student(3,"Tejas");  
	    	Parameterized_Constructor_Student s2 = new Parameterized_Constructor_Student(12,"Jawale");  
	    //calling method to display the values of object  
	    s1.display();  
	    s2.display();  
	   }  
	    

}
