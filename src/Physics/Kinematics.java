package Physics;

import java.util.Scanner;

public class Kinematics {

	Scanner scan;
	String y, x, t, v, vx, vy, asked, theta, reply, a, vf;
	
	public Kinematics(Scanner scan)
	{
		this.scan = scan;
	}
	
	public void question()
	{
		System.out.println("1D or 2D motion?");
		reply = scan.next();
		if(reply.equalsIgnoreCase("1D"))
		{
			solveMissingVariable1D();
		} else
		{
			solveMissingVariable2D();
		}
	}
	
	public void solveMissingVariable1D()
	{
		System.out.println("Put ? for missing terms");
		System.out.println("What is your distance in meters? x");
		x = scan.next();
		System.out.println("What is the time in seconds? t");
		t = scan.next();
		System.out.println("What is the acceleration in meters/second squared?");
		a = scan.next();
		System.out.println("What is the initial velocity in meters/second? v");
		v = scan.next();
		System.out.println("What is the final velocity in meters/second? vf");
		vf = scan.next();
		System.out.println("What are you solving for?");
		asked = scan.next();
		compute1D();
	}
	
	public void solveMissingVariable2D()
	{
		System.out.println("Put ? for missing terms");
		System.out.println("What is your height in meters? y");
		y = scan.next();
		System.out.println("What is your distance in meters? x");
		x = scan.next();
		System.out.println("What is the time in seconds? t");
		t = scan.next();
		System.out.println("What is the acceleration in meters/second squared?");
		a = scan.next();
		System.out.println("What is the total initial velocity in meters/second? v");
		v = scan.next();
		System.out.println("What is the initial velocity in the x direction in meters/second?");
		vx = scan.next();
		System.out.println("What is the initial velocity in the y direction in meters/second?");
		vy = scan.next();
		System.out.println("What is the initial angle?");
		theta = scan.next();
		System.out.println("What are you solving for?");
		asked = scan.next();
	}
	
	private void compute1D()
	{
		if(asked.equalsIgnoreCase("x") && !v.equals("?") && !t.equals("?"))
		{
			double v0 = Double.parseDouble(v);
			double t0 = Double.parseDouble(t);
			System.out.println("Distance is: " + (v0 * t0));
		} else if(asked.equalsIgnoreCase("a") && !vf.equalsIgnoreCase("?") && !v.equalsIgnoreCase("?") && !t.equals("?"))
		{
			double v0 = Double.parseDouble(v);
			double vf0 = Double.parseDouble(vf);
			double t0 = Double.parseDouble(t);
			System.out.println("Acceleration is: " + ((vf0 - v0)/t0));
		} else if(asked.equalsIgnoreCase("t") && !vf.equalsIgnoreCase("?") && !v.equalsIgnoreCase("?") && !a.equalsIgnoreCase("?"))
		{
			double v0 = Double.parseDouble(v);
			double vf0 = Double.parseDouble(vf);
			double a0 = Double.parseDouble(a);
			System.out.println("Time is: " + ((vf0 - v0)/a0));
		} else if((asked.equalsIgnoreCase("v") || asked.equalsIgnoreCase("vf")) && (!vf.equalsIgnoreCase("?") || !v.equalsIgnoreCase("?") && !a.equalsIgnoreCase("?") && !t.equalsIgnoreCase("?")) )
		{
			if(asked.equalsIgnoreCase("v"))
			{
				double vf0 = Double.parseDouble(vf);
				double t0 = Double.parseDouble(t);
				double a0 = Double.parseDouble(a);
				System.out.println("Initial Velocity: " + (vf0 - a0 * t0));
			} else {
				double v0 = Double.parseDouble(v);
				double t0 = Double.parseDouble(t);
				double a0 = Double.parseDouble(a);
				System.out.println("Final Velocity: " + (v0 + a0 * t0));
			}
		} else if(asked.equals("vf") && !a.equals("?") && !x.equalsIgnoreCase("?"))
		{
			double a0 = Double.parseDouble(a);
			double x0 = Double.parseDouble(x);
			System.out.println("Final Velocity: " + (Math.pow((0.5 * a0 * x0), 0.5)));
		}
	}
	
	private void compute2D()
	{
		
	}
	
}
