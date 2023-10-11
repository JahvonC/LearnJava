// CLASSES MUST BE NAMED THE SAME AS FILE AT TOP LEVEL
// TO FIX/CREATE A NEW CLASS NAME THE CLASS CANNOT BE PUBLIC
import java.util.Scanner;
import java.util.Random;

public class StaticNew {
 
    public static void main(String[] args){

        Scanner nameInput =  new Scanner(System.in);
        System.out.println("Enter Your name");
        String userName = nameInput.nextLine();
        System.out.println("The goal of the game is to get a score over 1000 in two tries, its all about luck! So Good luck " + userName + "!");
        Scanner newObj = new Scanner(System.in);
        System.out.println("Enter a number 1 - 25");
        String number = newObj.nextLine();
        Random goal = new Random();
            int min = 500, max = 1000;
        int randomGoal = goal.nextInt(((max - min) + 1) + min);
        int score = Integer.parseInt(number); 
        int scoreUpdate = Integer.parseInt(number) * 10;

        System.out.println("Goal to reach: " + randomGoal + "!");
        System.out.println("Score: " + scoreUpdate);

        if(scoreUpdate <= randomGoal){
            System.out.println("Your number * 30 = " + scoreUpdate);
        } else {
            System.out.println("Easy Game, " + userName + "!" + " You Win!");
        }

        while(scoreUpdate <= randomGoal){
            Scanner newObj2 = new Scanner(System.in);
            Random randomNumber = new Random();
            int max2 = 100, min2 = 15;
            System.out.println("Enter a new number");
            String numberTwo = newObj2.nextLine();
            int randomMulti = randomNumber.nextInt(((max2 - min2) + 1) + min );
            int scoreUpdate2 = scoreUpdate + (2 * randomMulti);

            System.out.println("Multiplyer = " + randomMulti );
            System.out.println("Score: " + scoreUpdate2);
            

            if(scoreUpdate2 <= randomGoal){
                Scanner newObj3 = new Scanner(System.in);
                System.out.println("game over, try again");
                System.out.println("Score is less than " + randomGoal);
                break;
            } else {
                System.out.println("You win! Good game! Score: " + scoreUpdate2);
                break;
            }
        } 

        
    }
}
