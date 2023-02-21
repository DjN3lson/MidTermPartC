package midtermexam_versiona_extensioncode;

import java.util.Scanner;

public class TestUserprofile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = input.nextLine();
        System.out.println("Choose your favorite Genre from the list below:");
        String[] genres = {"Comedy", "Drama", "Action", "Mystery"};
        for (int i = 0; i < genres.length; i++) {
            System.out.println((i+1) + ". " + genres[i]);
        }
        int genreChoice = input.nextInt();
        if (genreChoice < 1 || genreChoice > genres.length) {
            System.out.println("ERROR: Please enter a valid number!");
            System.exit(0);
        }
        String genre = genres[genreChoice-1];
        System.out.println("Your userprofile was created! \n" + name + "-" + genre);
} 
}
