package ControlStatement;

public class IfStatement_IfElseIfLadder
{

	public static void main(String[] args)
	{
//		    if(condition 1)
//		    {    
//			statement 1; //executes when condition 1 is true   
//			}  
//			else if(condition 2) 
//			{  
//			statement 2; //executes when condition 2 is true   
//			}  
//			else
//			{  
//			statement 2; //executes when all the conditions are false   
//			}  

		
		String Name = "Tejas";  
		if(Name == "Satish") 
		{  
		System.out.println("Name is satish");  
		}
		else if (Name == "Jawale") 
		{  
		System.out.println("Name is Jawale");  
		}
		else if(Name == "Tushar") 
		{  
		System.out.println("Name is Tushar");  
		}
		else {  
		System.out.println(Name);  
		}  
	}

}
