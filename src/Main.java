import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner  in = new Scanner(System.in);
        System.out.println("Please enter a tweet: ");
        String tweet = in.nextLine();

        int hashtags = 0, attributions = 0, links = 0;

        if (tweet.length() <= 140){
            System.out.println("Length Correct.");
            for(int i = 0; i < tweet.length(); i++){
                char letter = tweet.charAt(i);
		if (letter == '#')hashtags++;
		else if (letter == '@')attributions++;
	        else if (letter == 'h'&& tweet.startsWith("http://",i)) links++; 
            }
		
            System.out.println("Number of Hashtags: " + hashtags);
            System.out.println("Numbers of Attributions: " + attributions);
            System.out.println("Numbers of Links: " + links);

        } else {
            System.out.println("Excess character: " + (tweet.length()-140));
        }
}
