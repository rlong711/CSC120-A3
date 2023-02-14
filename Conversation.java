import javax.swing.UIClientPropertyKey;
import java.util.Scanner;

public class Conversation {
  
  public static void main(String[] args) {
  
    Double Rounds; 
    Scanner in; 
    String response_list; 
    
    response_list = new String[3]; 

    in = new Scanner(System.in);
    
    System.out.println("How many Rounds? ");
    Rounds = in.nextDouble(); 
    
    String user_input; 


    Scanner my_convo = new Scanner(System.in); 
    
    for (int i = 0; i < Rounds; i++) {
      user_input = my_convo.nextLine(); 
      System.out.println(user_input);

      

    // System.exit(0); 

    }




    


  
    
    
  }

  
}



