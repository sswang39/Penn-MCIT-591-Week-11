import java.io.*;
import java.util.*;
public class GithubExample {
	
	public static void main(String[] args) {
		/*
		 * Penn MCIT Week 11
		 * Github 
		 */
		
		System.out.println("Let's calculate distance with this complicated equation:");
		System.out.println();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Velocity, which is a fancy way of saying speed:");
		double velocity = s.nextDouble();
		System.out.println("Enter time:");
		double time = s.nextDouble();
		double distance = velocity * time;
		System.out.println();
		System.out.println("Distance is " + distance);
	}

}
