/*
 * file: ManWolf.java
 * author: Katie Bartolotta
 * course: CMPT 440
 * assignment: homework 1
 * due date: March 12, 2019
 * version: 1.3
 * 
 * This file contains the states present in the 
 * man-wolf-goat-cabbage DFA along with the transitions 
 * and accepting states.
 */

/*
 * ManWolf
 * 
 * This class implements an array to represents the transitions 
 * from state to state in the DFA. It defines what states are 
 * accepted and rejected.
 */
public class ManWolf {
	
  /*
   * Define constants q0 through q10 that 
   * represent the different states of the DFA
   */
  private static final int q0 = 0;
  private static final int q1 = 1;
  private static final int q2 = 2;
  private static final int q3 = 3;
  private static final int q4 = 4;
  private static final int q5 = 5;
  private static final int q6 = 6;
  private static final int q7 = 7;
  private static final int q8 = 8;
  private static final int q9 = 9;
  private static final int q10 = 10;
  
  private int state;
  
  /*
   * Transition Function
   * 
   * This function creates an array that 
   * represents the possible transitions at each state
   * 
   * The columns of this array represent c, g, w, and n respectively 
   */
  static private int[][] delta = {
    {q10, q1, q10, q10},
    {q10, q0, q10, q2},
    {q3, q10, q4, q1},
    {q2, q5, q10, q10},
    {q10, q6, q2, q10},
    {q10, q3, q7, q10},
    {q7, q4, q10, q10},
    {q6, q10, q5, q8},
    {q10, q9, q10, q7},
    {q10, q8, q10, q10},
    {q10, q10, q10, q10}
  };
  
  /*
   * Reset Function
   * 
   * Sets the state of the DFA to the beginning, or q0.
   */
  public void reset() {
    state = q0;
  }
  
  /*
   * Accepted Function
   * 
   * When the state is equivalent to q9, the accepted 
   * boolean will be true and the DFA will be in an 
   * accepting state.
   */
  public boolean accepted() {
    return state == q9;
  }
  
  /*
   * Process Function
   * 
   * This function processes the input given and 
   * determines the path to be taken through the DFA.
   * 
   * Parameters:
   *   in: the string given to the command line
   *   c: the character being evaluated
   *   
   * Each letter of the input is read one at a time 
   * and the transition function is referenced to 
   * determine the next state to go to.
   * 
   * If the letter isn't c, g, w, or n, then the state 
   * will transition to q10, the error state.
   */
  public void process(String in) {
	for(int i = 0; i < in.length(); i++) {
	  char c = in.charAt(i);
	  try {
	    if (c=='c') {
	      state = delta[state][0];
		}
		else if (c=='g'){
          state = delta[state][1];
		}
		else if (c=='w'){
	      state = delta[state][2];
	    }
		else if (c=='n'){
	      state = delta[state][3];
	    }
	  }
	  catch(ArrayIndexOutOfBoundsException ex) {
        state = q10;
	  }
	}
  } 
}
