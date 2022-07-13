package ControlStatement;

public class Loop_ForEachLoop {

	public static void main(String[] args) {
		String[] names = {"Java","C","C++","Python","JavaScript"};    
		System.out.println("Printing the content of the array names:\n");    
		for(String name:names) {    
		System.out.println(name);    
		}

	}

}
//output;
//Printing the content of the array names:
//
//Java
//C
//C++
//Python
//JavaScript