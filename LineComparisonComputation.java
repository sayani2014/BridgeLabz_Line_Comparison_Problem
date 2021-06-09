import java.util.*;
import java.lang.Math.*;

public class LineComparisonComputation {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of (x1,y1) and (x2,y2) of line A: ");
                float x1=sc.nextFloat();
	        float y1=sc.nextFloat();
	        float x2=sc.nextFloat();
	        float y2=sc.nextFloat();    
		double lengthLineA = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
 	 	System.out.println("The 2 points of the line A are: (" +x1+ "," +y1+ ") and (" +x2+ "," +y2+ ")");

		System.out.print("Enter the value of (m1,n1) and (m2,n2) of line B: ");
                float m1=sc.nextFloat();
	        float n1=sc.nextFloat();
	        float m2=sc.nextFloat();
	        float n2=sc.nextFloat();    
		double lengthLineB = Math.sqrt(Math.pow(m2 - m1, 2) + Math.pow(n2 - n1, 2));
 	 	System.out.println("The 2 points of the line B are: (" +m1+ "," +n1+ ") and (" +m2+ "," +n2+ ")");	 	    
  	        
		String lineA = String.valueOf(lengthLineA);
		String lineB = String.valueOf(lengthLineB);
		if(lineA.compareTo(lineB) == 0)
			System.out.println("Line A and Line B are equal");
		else if(lineA.compareTo(lineB) > 0)
			System.out.println("Line A is greater than Line B");
		else if (lineB.compareTo(lineA) > 0)
			System.out.println("Line B is greater than Line A");
		
		System.out.println("Length of the line A is : "+lengthLineA+ " units.");
		System.out.println("Length of the line B is : "+lengthLineB+ " units.");
	}
}