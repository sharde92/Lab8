
import java.util.Scanner;
public class StudentArray {
	

	public static void main(String[] args) {
		//Define the elements of your student info array. In this case it's student names, hometown and favorite movie.
		String [] studentNames = { "Sharde", "Anesha", "Louis", "Shontininique", "Stan", "Kari", "Virginia", "Darby"};
		String[] hometown = { "Detroit", "Brooklyn", "Bloomfield Hills", "San Francisco", "Manchester", "New Orleans",
				"Oahu", "Anchorage" };
		String[] films = { "Fight Club", "Ferris Bueller's Day Off", "Akira", "Sweeney Todd", "Coming To America",
				"Titanic", "The Good Fellas", "Rocky Horror Picture Show" };
		
		Scanner scnr = new Scanner(System.in);
		int studentNumber;
		boolean validInput;
		boolean responseContinue;
		int i;
		
		
		//ask which student the user would like to learn about.
		
		System.out.println("Welcome to our Java Class. Which Student would you like to learn more about?(enter a number 1-8):");
		i = scnr.nextInt();
		i -= 1;
		String name = studentNames[i];
			System.out.println(name);
			
			System.out.println("What would you like to know about" + name + "? (enter hometown or film:)");
			scnr.nextLine();
		
			String response = scnr.nextLine();
			
			for ( i=0; i< studentNames.length; i++) {
				System.out.println(studentNames [i] + " " + hometown [i]);
			
		
		}
		
	}
}


