package Physics;

import java.util.Scanner;

public class PhysicsObject {
	
	static Scanner scan;
	public Kinematics kinematics = null;
	
	public PhysicsObject(Scanner scan)
	{
		kinematics = new Kinematics(scan);
	}
	
}
