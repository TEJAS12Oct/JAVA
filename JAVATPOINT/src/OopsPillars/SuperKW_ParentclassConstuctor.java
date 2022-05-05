package OopsPillars;

class Tree {
	Tree() {
		System.out.println("Tree is Beautiful");
	}
}

	class Tulsi extends Tree {
		Tulsi() {
			super();
			System.out.println("tulsi is medicine");
		}
	}

	public class SuperKW_ParentclassConstuctor {

		public static void main(String[] args) {
			Tulsi T = new Tulsi();
		}
	
}