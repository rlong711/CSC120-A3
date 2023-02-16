import javax.swing.UIClientPropertyKey;
import java.util.Scanner;

public class Conversation {
  
  public static void main(String[] args) {
  
    Double Rounds; 
    Scanner in; 
    
    
    String[] responses = {"hmmm", "Tell me more!", "That's crazy!!"}; 



    
    

    in = new Scanner(System.in);
    
    System.out.println("How many Rounds? ");
    Rounds = in.nextDouble(); 
    
    String user_input; 


    Scanner my_convo = new Scanner(System.in); 
    
    for (int i = 0; i < Rounds; i++) {
      user_input = my_convo.nextLine(); 
      int randomIndex = (int)(Math.random()*responses.length); 
      String randomElement = responses[randomIndex]; 
      System.out.println(randomElement); 

      

    // System.exit(0); 

    }




    


  
    
    
  }

  
}



