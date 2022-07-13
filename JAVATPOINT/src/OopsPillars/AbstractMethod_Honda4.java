package OopsPillars;

		abstract class Bike{  
			  abstract void run();  
			}  
		class AbstractMethod_Honda4 extends Bike{  
			void run(){System.out.println("running safely");}  
			public static void main(String args[]){  
			 Bike obj = new AbstractMethod_Honda4();  
			 obj.run();  
			}  

	

}
