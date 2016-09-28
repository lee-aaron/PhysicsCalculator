import java.util.*;
import Physics.PhysicsObject;

public class PhysicsCalculator {

	public static void main(String []args) {
		
		Scanner scan = new Scanner (System.in);
		PhysicsObject obj = new PhysicsObject(scan);
		boolean settings = true;
		System.out.println("This is a sample calculator. It doesn't fully function if you enter in a an integer when prompted for a string. It's just a fun project with intended inputs.");
		while(settings)
		{
			System.out.println("What would you like to solve today?");
			String solve = scan.next();
			if(solve.equalsIgnoreCase("Kinematics"))
			{
				obj.kinematics.question();
			} else if(solve.equalsIgnoreCase("Force"))
			{
				
			} else {
				settings = false;
			}
		}
	}
	
}
