import javax.swing.UIClientPropertyKey;
import java.util.Scanner;

public class Conversation {
  
  public static void main(String[] args) {
    System.out.println("Hello! and Welcome to the chat-box!!"); 
  
    System.out.println("How many rounds of conversation would you like? ");
  
    Double Rounds; 
    Scanner in; 

    in = new Scanner(System.in);
    System.out.println("Enter how many rounds of conversation you would like: ");
    Rounds = in.nextDouble(); 
    System.exit(0);
    
  }

  
}



