package OopsPillars;

class programmer {
	float salary = 40000;
}

class Inheritance_Employee extends programmer {
	float bonus = 10000;

	public static void main(String[] args) {
		Inheritance_Employee p = new Inheritance_Employee();
		System.out.println("Programmmer salary is :" +p.salary);
		System.out.println("Bonus of Prpgrammr is :" +p.bonus);

	}

}
