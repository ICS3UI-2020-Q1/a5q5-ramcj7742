import java.util.Scanner;
/**
 * Prints a row of astericks the length of user chosing between 1 and 10
 * @author Jaden Ramcharan
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // creates scanner for user input
    Scanner input = new Scanner(System.in);

    //gets number from user
    System.out.println("Please enter a number between 1 and 10");
    int userNum = input.nextInt();

    //loop that prints desired amount of astericks
    for(int i = 0; i < userNum; i++){
      System.out.print(" * ");
    }
  }
}
