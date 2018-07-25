import java.util.Scanner;

public class StudentInfo {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String[] students = new String[8];

		String[] myStudents = { "Sharde", "Virginia", "Louis", "Shontinique", "Kari", "Darby", "Stan", "Anesha" };
		String[] hometown = { "Detroit", "Brooklyn", "Bloomfield Hills", "San Francisco", "Manchester", "New Orleans",
				"Oahu", "Anchorage" };
		String[] films = { "Fight Club", "Ferris Bueller's Day Off", "Akira", "Sweeney Todd", "Coming To America",
				"Titanic", "The Good Fellas", "Rocky Horror Picture Show" };

		int input = 0;
		boolean userInput;

		System.out.println("Which student would you like to learn more about? (enter a number 1-8) : ");
		input = scnr.nextInt();
		input -= 1;
		String name = myStudents[input];
			System.out.println(name);
			
			System.out.println("What would you like to know about" + name + "? (enter hometown or film:)");
			scnr.nextLine();
		
			String response = scnr.nextLine();
			
			if (response.matches("hometown")) {
				
				System.out.println(hometown[input]);
				
			}else { 
				
				if (response.matches("films")) {
					System.out.println(films[input]); {
			}
					
					System.out.println("Would you like to know more? (enter: yes or no)" );
					scnr.nextInt();
					userInput = scnr.next().charAt(0);
			        if (userInput =='yes') {
			            response = true;
			        }else {response = false;
			        System.out.println("Goodbye! ");
			        }
			        }while (response == true);
			        scnr.close();
			}
			
			
			
			
		}
	}


