package ControlStatement;

public class IfStatement_NestedIfStatement 
{

	public static void main(String[] args) 
	{
//		    if(condition 1) 
//		    {    
//			statement 1; //executes when condition 1 is true   
//			if(condition 2) 
//			{  
//			statement 2; //executes when condition 2 is true   
//			}  
//			else
//			{  
//			statement 2; //executes when condition 2 is false   
//			}  
//		    }  
	
//		String address = "Tejas,Delhi, India";    
//	    
//		if(address.endsWith("India")) 
//		{    
//		if(address.contains("Meerut")) // condition false
//		{    
//		System.out.println("Your city is Meerut");    
//		}
//		else if(address.contains("Noida")) //condition false
//		{    
//		System.out.println("Your city is Noida");    
//		}
//		else 
//		{    
//		System.out.println(address.split(",")[0]); = Tejas
//		System.out.println(address.split(",")[1]); = Delhi 
//		System.out.println(address.split(",")[2]); = India
//		}    
//		}
//		else 
//		{    
//		System.out.println("You are not living in India");    
//		}    
		
		String address = "Tejas,Delhi, India";
		
		if(address.endsWith("India"))  // condition True
	  //if(address.endsWith("Delhi"))  // condition False
		{    
		
	    //if(address.contains("Tejas"))  // condition True = then its not check next condition 
        if(address.contains("Meerut")) // but condition is false then check next condition
		{    
		//System.out.println("Your city is Tejas");
		System.out.println("your city is Meerut");
		}
        
        
		//else if(address.contains("Delhi"))// condition True = then its not check next condition 
		else if(address.contains("Noida")) // but condition is false then check next condition
	    {    
		//System.out.println("Your city is Delhi");
		System.out.println("Your city is Noida"); 
		}
		
		else // first condition is true and other condition is false then go to  else statement
		{    
		System.out.println(address.split(",")[0]);
		System.out.println(address.split(",")[1]); 
		System.out.println(address.split(",")[2]); 
		}    
		}
		
		else // First condition is false then go to else statement
		{    
		System.out.println("You are not living in India");    
		}    
		   
	
	
	}

}
