/*
 *Class: CMSC203 CRN 30340
 *Program: Lab 1
 *Instructor: Khandan Monshi
 *Summary of Description: Gets information from user and sends it to movie file to print out a result using toString. After that it offers a choice to restart or end the code.
 *Due Date: 2/20/2024
 *Integrity Pledge: I pledge that I have completed the programming assignment independently. I have not copied the code from a student or any source.
 */

//import
import java.util.Scanner;

//class
public class MovieDriver_Task2 {

	//main
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		String proceed=new String("y");
		Movie m2 = new Movie();
		
		do {
		
			System.out.println("Enter the name of the movie");
			m2.setTitle(keyboard.nextLine());//get title
			
			System.out.println("Enter the rating of the movie");
			m2.setRating(keyboard.nextLine());//get rating
			
			System.out.println("Enter the number of tickets sold for this movie");
			m2.setSoldTickets(keyboard.nextInt());//get number of tickets
			
			System.out.println(m2);//print out value
			keyboard.nextLine();
			
			//continue on
			System.out.println("Do you want to enter another? (y or n)");
			proceed = keyboard.nextLine();
			
		}while(proceed.equalsIgnoreCase("y"));//do while
		
		
	}//void main
	
}//MovieDriver
