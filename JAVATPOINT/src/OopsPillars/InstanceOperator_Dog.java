package OopsPillars;

class Animale {
}

class InstanceOperator_Dog extends Animale {// Dog inherits Animal

	public static void main(String[] args) {
		InstanceOperator_Dog d = new InstanceOperator_Dog();
		System.out.println(d instanceof Animale);// true
	}
}



//class InstanceOperator_Dog{  
//	 public static void main(String args[]){  
//	 InstanceOperator_Dog d=null;  
//	  System.out.println(d instanceof InstanceOperator_Dog);//false  
//	 }  
//	}  