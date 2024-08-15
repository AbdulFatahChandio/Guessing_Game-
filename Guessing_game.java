import java.util.Scanner;
public class Guessing_game
{
    public static void main(String[] args)
    {
        System.out.println();
        System.out.println(" ** Welcome to Fatah's Number Guessing Game **");
        System.out.println();
        Scanner input = new Scanner(System.in);
        int guess = (int)(Math.random()*100)+1;
        int numOfGuess = 10; // to set limitation on guessing chance
        do{
            System.out.print("Guess a Number : ");
            int num = input.nextInt();
            if(num==guess){
                System.out.println("Good You Win The Game ");
                break;
            }
            if(--numOfGuess==0){
                System.out.println("oh! try again >>>>>>>>>");
            }
            if(num>guess)
                System.out.println("think lesser ");
            else
                System.out.println("think greater");
        } while(true);
    }
}