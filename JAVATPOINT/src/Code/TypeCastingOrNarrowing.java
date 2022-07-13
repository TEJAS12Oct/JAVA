package Code;

public class TypeCastingOrNarrowing 
{

	public static void main(String[] args) 
	{
		float f=12.99f;  
		                      //int a=f;//Compile time error  
		int a=(int)f;  
		System.out.println(f);  
		System.out.println(a); 
		

	}

}
//In case of narrowing, explicit type casting is mandatory.