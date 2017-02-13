/*
 */

//
import java.util.Scanner;
//import java.util.*;

public class Five {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    String sentence;
    
    System.out.print("Enter a sentence: ");
    sentence = input.nextLine();
    
    for (int i = 0; i < sentence.length(); i++){
      char c = sentence.charAt(i);
      if (c != ' ') {
        System.out.print(c);
      } else {
        System.out.println(c);
      } 
    }
    System.out.println();
    input.close();
  }
}