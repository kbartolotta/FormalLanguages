/*
 * file: DFA.java
 * author: Katie Bartolotta
 * course: CMPT 440
 * assignment: Project
 * due date: May 15, 2019
 * version: 2.0
 * 
 * This file contains the filter for 
 * the standard input stream in reference to the DFA.java file.
 */
import java.io.*;
/*
 * driver DFA
 * 
 * This class filters through the command line input and runs 
 * through the functions in the DFA.java file to determine 
 * if the input is a solution or not.
 */
public class driverDFA {
  public static void main (String[] args)

      throws IOException{

    //Refers to the DFA file
    DFA d = new DFA();
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    //Set the input string to s
    String s = in.readLine();

    //Check that the string is not null first.
    while (s != null) {
      //Set the state to the start state, q0.
      d.reset();
      //Using the string s, go through the process function.
      d.process(s);
      //If the string ends in an accepted state, tell the user it is a solution.
      if (d.accepted()) {
        for (int i = 0; i < in.length(); i++) {
        char c = in.charAt(i);
        if (in[0] == [4]){
          System.out.println("That is a valid Visa card");
        }
       // System.out.println("That is a solution.");
      }
      //If the string does not end in an accepting state, 
      //tell the user it is not a solution.
      else if(!d.accepted()) {
        System.out.println("That is not a solution.");
      }
      //Read the next string entered in the command line
      s = in.readLine();
    }
  }
}
