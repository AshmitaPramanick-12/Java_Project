import java.util.Random;
import java.util.Scanner;

public class numberguessing20 {
    public static void main(String[] args) {
        //NUMBER GUESSING GAME
        Random random=new Random();
        Scanner scanner= new Scanner(System.in);

        int guess;
        int attempts=0;
        int min=1;
        int max=100;
        // int randomNumber=random.nextInt(1,100);
        int randomNumber=random.nextInt(min,max+1);

        System.out.println("Number Guessing Game");
        // System.out.println("Guess a number between 1-100:");
        System.out.printf("Guess a number between %d-%d:\n",min,max);

        do{
            System.out.println("Enter a guess");
            guess=scanner.nextInt();
            attempts++;

            if(guess<randomNumber){
                System.out.println("TOO LOW! TRY AGAIN");
            }
            else if(guess>randomNumber){
                System.out.println("TOO HIGH! TRY AGAIN");
            }
            else{
                System.out.println("CORRECT! The Number was "+randomNumber);
                System.out.println("No. of attempts: "+attempts);
            }
        }while(guess!=randomNumber);

        System.out.println("You have won.");
        scanner.close();
            
    }
}
