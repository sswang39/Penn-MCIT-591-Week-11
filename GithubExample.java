import java.io.*;
import java.util.*;
public class GithubExample {
	
	public static void main(String[] args) {
		/*
		 * Penn MCIT Week 11
		 * Github 
		 */
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter velocity, which is a fancy way of saying speed:");
		double velocity = s.nextDouble();
		System.out.println("Enter time:");
		System.out.println("Of course, time is relative and dilates with speed.");
		double time = s.nextDouble();
		double distance = velocity * time;
		System.out.println();
		System.out.println("Distance is " + distance);
	}

}
