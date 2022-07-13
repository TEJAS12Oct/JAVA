package Code;

public class AddingLowTypeNo {

	

		public static void main(String []args) 
		//public static void main(String args[]){ 
		{
			byte a=30;  
			byte b=40;  
			//byte c=a+b;//Compile Time Error: because a+b=70 will be int  
			byte c=(byte)(a+b);  
			System.out.println(c); 
		}

	

}
