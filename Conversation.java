
/**
 * Imports necessary methods for desired output. 
 */
import javax.swing.UIClientPropertyKey;

import java.util.ArrayList;
import java.util.Scanner;


/**
 * Creates class Conversation where code will go below
 */

public class Conversation {
  
  public static void main(String[] args) {

    /**
     * Establishes the type of the variables used (Rounds, in, my_convo, and Transcript)
     */
    Double Rounds; 
    Scanner in; 
    ArrayList <String> Transcript = new ArrayList<String>(); 
    Scanner my_convo; 

    /**
     * Creates Lists for the responses that will answer the user input. Also creates lists for the mirror words and the replacements for those mirror words if they show up in the user input. 
     */
    
    String[] responses = {"hmmm", "Tell me more!", "That's crazy!!"}; 
    String [] mirror_words = {"I", "me", "am", "you", "my", "your"}; 
    String [] replacements = {"you", "you", "are", "I", "your", "my"};
    



    
    
    /**
     * Creates new scanner for the amount of rounds of conversation the user indicates they want. Also adds the question and how many rounds they input into the final transcript. 
     */
    in = new Scanner(System.in);

    
    System.out.println("How many Rounds? ");
    Rounds = in.nextDouble(); 
    Transcript.add("How many Rounds? " + Rounds); 
    System.out.println("Now...Tell me what is on your mind.");
    Transcript.add("Now...Tell me what is on your mind");

    // String new_sentence = " "; 


    /**
     * Creates new scanner for the user input in the conversation.
     */
    my_convo = new Scanner (System.in); 

    /**
     * Asks for a user input and returns a random response from the response list created earlier as many times as the user said when asked how many rounds they wanted to do. 
     */
    for (int i = 0; i < Rounds; i++) {
      String user_input = my_convo.nextLine(); 
      String user_input_string = String.valueOf(user_input); 
      Transcript.add(user_input_string); 
      String[] user_input_splitted = user_input_string.split("\\s+"); 

      // for (int j = 0; j < user_input_splitted.length; j++) {
      //   for (int k = 0; k < mirror_words.length; k++) {
      //     if (user_input_splitted[j].equals(mirror_words[j])) {
      //       String replacement_response = user_input_splitted[j].replace(user_input_splitted[j], replacements[j]);
      //       System.out.println(replacement_response);
      //     }
      //       else {
      //         int randomIndex = (int)(Math.random()*responses.length); 
      //         String randomElement = responses[randomIndex]; 
      //         System.out.println(randomElement); 
      //     }
      //   }
      // } //I tried my best to get the mirror words and replacements to work. My attempt is above this. 

      int randomIndex = (int)(Math.random()*responses.length); 
      String randomElement = responses[randomIndex]; 
      System.out.println(randomElement); 
      Transcript.add(randomElement); 

      

    // System.exit(0); 

    }

/**
 * Prints out the transcript of the conversation. 
 */
    System.out.println("Transcript: "); 
    
    for (String str: Transcript) {
      System.out.println(str);
    }





    


  
    
    
  }

  
}



