import java.io.*;
import java.util.*;

public class Tester {

	public static void main(String[] args) {
	Scanner AdrianIsPoopy=new Scanner(System.in);	
	System.out.println("Enter an integer.");
    int a=AdrianIsPoopy.nextInt();
    
    
    if (a%2==0)
    {System.out.print("The integer ");
    System.out.print(a);
    System.out.println(" is even.");
    }
    		
    else 
    {System.out.print("The integer ");
	System.out.print(a);
	System.out.println(" is odd.");
	
    }
	}

}