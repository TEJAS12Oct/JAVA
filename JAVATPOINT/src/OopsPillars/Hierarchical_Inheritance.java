package OopsPillars;

class Animalll{  
void eat(){System.out.println("eating...");}  
}  
class Doggg extends Animalll{  
void bark(){System.out.println("barking...");}  
}  
class Cat extends Animalll{  
void meow(){System.out.println("meowing...");}  
}  
public class Hierarchical_Inheritance {

	public static void main(String[] args) {
		Cat c=new Cat(); 
		Doggg d=new Doggg();
		c.meow();  
		c.eat();  
		//c.bark();//C.T.Error 
		d.bark();

	}

}
