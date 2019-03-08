/*
 * file: driverDFA.java
 * author: Katie Bartolotta
 * course: CMPT 440
 * assignment: homework 1
 * due date: March 12, 2019
 * version: 1.2
 * 
 * This file contains the filter for 
 * the standard input stream in reference to the ManWolf.java file.
 */
import java.io.*;
/*
 * driver DFA
 * 
 * This class filters through the command line input and runs 
 * through the functions in the ManWolf.java file to determine 
 * if the input is a solution or not.
 */
public class driverDFA {
  public static void main (String[] args)
  
    throws IOException{
	  
	  //Refers to the ManWolf DFA file
      ManWolf m = new ManWolf();
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      
      //Set the input string to s
      String s = in.readLine();
      
      //Check that the string is not null first.
      while (s != null) {
    	//Set the state to the start state, q0.
        m.reset();
        //Using the string s, go through the process function.
    	m.process(s);
    	//If the string ends in an accepted state, tell the user it is a solution.
    	if (m.accepted()) {
    	  System.out.println("That is a solution.");
    	}
    	//If the string does not end in an accepting state, 
    	//tell the user it is not a solution.
    	else if(!m.accepted()) {
    	  System.out.println("That is not a solution.");
    	}
    	//Read the next string entered in the command line
    	s = in.readLine();
      }
    }
}
