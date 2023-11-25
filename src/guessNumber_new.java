import java.util.Scanner;

public class guessNumber_new {
    static Scanner scanner = new Scanner(System.in);
    static int secretnumber = 5;

    public static void main(String[] args) {
        System.out.println("Welcome to the Game - Guess the Number!");
        start();}

    static void start (){
        int attempt = readNumberOfAttempts();
        guessNumber(attempt);
        scanner.close();
    }
        static int readNumberOfAttempts (){
            System.out.println("Enter the number of attempts:");
            return scanner.nextInt();    }

        static int readSecretNumber(){
            System.out.println("Guess the number between 0 and 9");
            return scanner.nextInt();}

        static void guessNumber (int attempt) {
            while (attempt > 0) {
                int number = readSecretNumber();
                attempt--;

            if (number == secretnumber) {
                System.out.println("You are right! You have quessed the secret number!\n");
                return ;
            } else {
                System.out.print("Sorry, the number ");
                if (number < secretnumber)
                    System.out.println("is too small\n");
                else System.out.println("is too big\n");
                System.out.println("You have " + attempt + " attempts left.");
            }
        }
        System.out.println("Sorry! Your attempts is out.");
    }
}

