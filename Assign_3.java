package Session_2;
import java.util.*;

public class Assign_3 {
 public void highest(int a,int b, int c)
 {
	 if (a>b && a>c)
		 System.out.println("highest no is "+ " "+ a);
	 else if(b>a && b>c)
		 System.out.println("highest no is "+ " "+ b);
	 else if(c>a && c>b)
		 System.out.println("highest no is "+ " "+ c);
		 
 }
	
	public static void main(String[] args) {
		int a,b,c;
		Assign_3 obj= new Assign_3();
		Scanner in= new Scanner(System.in);
		System.out.println("Enter 3 numbers");
		a=in.nextInt();
		b=in.nextInt();
		c=in.nextInt();
		obj.highest(a, b, c);
		
		
		

	}

}
