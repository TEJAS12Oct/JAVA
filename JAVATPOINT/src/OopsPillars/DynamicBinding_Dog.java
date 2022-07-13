package OopsPillars;

class Animalye{  
	 void eat(){System.out.println("animal is eating...");}  
	}  
	  
	class DynamicBinding_Dog extends Animalye{  
	 void eat(){System.out.println("dog is eating...");}

	public static void main(String[] args) {
		 Animalye a=new DynamicBinding_Dog();  
		  a.eat(); 
	}

}
