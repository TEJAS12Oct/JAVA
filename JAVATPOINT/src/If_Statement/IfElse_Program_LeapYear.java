package If_Statement;

public class IfElse_Program_LeapYear {

	public static void main(String[] args) {
		 int year=2021;    
		    if(((year % 4 ==0) && (year % 100 !=0)) || (year % 400==0)){  
		        System.out.println("LEAP YEAR");  
		    }  
		    else{  
		        System.out.println("COMMON YEAR");  
		    } 
	}

}