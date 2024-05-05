package task1;

import java.util.Scanner;
import java.util.Random;

class Game{

    public int UserInput, ComputerInput, count=0;
    public Scanner sc = new Scanner(System.in);

    public int game(){
        Random random = new Random();
        ComputerInput = random.nextInt(100)+1;
        return ComputerInput;
    }

    public int getUserInput(){
               UserInput = sc.nextInt();
               return UserInput;
    }

    public boolean isCorrectNumber(){
        if(UserInput==ComputerInput){
            count++;
            System.out.println("Congratulations!!!!");
            System.out.println("You guessed in " + count + " steps");
            return true;
        }
        else if(UserInput>ComputerInput){
            count++;
            System.out.println("Guess lower");
            return false;
        }
        else{
            count++;
            System.out.println("Guess higher");
            return false;
        }      
    }

    public static void main(String [] args){
        Game player = new Game();
        System.out.println("WELCOME TO THE GUESSING GAME!!");
        System.out.print("Enter a number: ");
        player.getUserInput();
        player.game();
        while(!player.isCorrectNumber()){
            System.out.print("Enter another number: ");
            player.getUserInput();
        }
    }
}