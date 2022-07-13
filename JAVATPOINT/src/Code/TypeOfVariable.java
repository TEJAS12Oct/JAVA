package Code;

public class TypeOfVariable 
{

    static int m=100;//static variable  
    void method()  
    {    
        int n=90;//local variable
        System.out.println("n = " + n);
    }  
    public static void main(String args[])  
    {  
        int data=50;//instance variable
        System.out.println(data);
        System.out.println(m);
        TypeOfVariable n = new TypeOfVariable();
        n.method();
    }  

}
