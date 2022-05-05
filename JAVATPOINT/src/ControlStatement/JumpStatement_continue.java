package ControlStatement;

public class JumpStatement_continue {

	public static void main(String[] args) {
		for(int i = 0; i<= 2; i++) {  
			  
			for (int j = i; j<=5; j++) {  
			  
			if(j == 4) {  
			continue;  
			}  
			System.out.println(j);  
			}  
			}  

	}

}

//output :
//i=	0
//j=	1
//		2
//		3
//		5
//	
//i=	1
//j=	2
//		3
//    	5
//	
//i=2	2
//j=	3
//		5
