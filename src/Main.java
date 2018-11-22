import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner  in = new Scanner(System.in);
        System.out.println("Please enter a tweet: ");
        String tweet =in.nextLine();

        int a = 0;
        int hashtags = 0;
        int attributions = 0;
        int links = 0;
        char letter;

        if (tweet.length() <= 140){

            System.out.println("Length Correct.");
            while (a<tweet.length()){
                letter = tweet.charAt(a);

                if (letter == '#'){
                    hashtags++;
                    a++;
                }
                if (letter == '@'){
                    attributions++;
                    a++;
                }
                if (letter == 'h'){

                    if (tweet.startsWith("http://",a) ){
                        links++;
                        a++;
                    }else{
                        a++;
                    }
                }else{
                    a++;
                }

            }
            System.out.println("Number of Hashtags: " + hashtags);
            System.out.println("Numbers of Attributions: " + attributions);
            System.out.println("Numbers of Links: " + links);

        }else{
            System.out.println("Excess character: " + (tweet.length()-140));
        }




    }
}
