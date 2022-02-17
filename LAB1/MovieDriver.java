import java.util.Scanner;

public class MovieDriver {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		String repeat ="y";
		do{
			String title, rating;
			int soldTickets;
			Movie myMovie = new Movie();
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the name of a movie");//get the name
			title = scan.nextLine();
			myMovie.setTitle(title);
			System.out.println("Enter the rating of the movie");//get the rating
			rating = scan.nextLine();
			myMovie.setRating(rating);
			System.out.println("Enter the number of tickets sold for this movie");//get the number of tickets sold
			soldTickets = scan.nextInt();
			myMovie.setSoldTickets(soldTickets);
			String result = myMovie.toString();
			System.out.println(result);
			System.out.println("Do you want to enter another?(y or n)");//ask if the user want to repeat
			repeat = scan.next();
		} while ("y".equals(repeat));
		
		System.out.println("Goodbye!!!");
	}

}
