package Operators;

public class NegativeShift {

	public static void main(String[] args) 
	{
		 //For positive number, >> and >>> works same  
	    System.out.println(20>>2);  //5  = 20/2^2
	    System.out.println(20>>>2); //5  = 20/2^2
	    
	    
	    //For negative number, >>> changes parity bit (MSB) to 0  
	    System.out.println(-20>>2);  // -5
//	    20 binary = 0001  0100
//	    inverts   = 1110  1011
//	    +1        = 1110  1100 
//	    -20       = 1110  1100
//	    
//	    -20       = 1110  1100
//	    >>2       = 1111  1011|00
//	    -20>>2    = 1111  1011
//	    -1        = 1111  1010
//	    inverts   = 0000  0101
//	    
//  convert decimal =     8421   
//	                      0401 = 5 ==> -5
	   
	    System.out.println(-20>>>2);
	    // 32 bit  
//	    -20>>2  =    11111111|11111111|11111111|11111011
//	    -20>>>2 =    00111111|11111111|11111111|11111011 = decimal conversion = 1073741819
	    

	}

}
