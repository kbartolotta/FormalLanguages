/*
 * file: DFA.java
 * author: Katie Bartolotta
 * course: CMPT 440
 * assignment: Project
 * due date: May 15, 2019
 * version: 2.0
 * 
 * This file contains the states present in the 
 * credit card validation DFA along with the transitions 
 * and accepting states.
 */

/*
 * DFA
 * 
 * This class implements an array to represents the transitions 
 * from state to state in the credit card validation DFA. It defines what states are 
 * accepted and rejected.
 */
public class DFA {

  /*
   * Define constants q0 through q40 that represent the different states of the
   * DFA
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
  private static final int q11 = 11;
  private static final int q12 = 12;
  private static final int q13 = 13;
  private static final int q14 = 14;
  private static final int q15 = 15;
  private static final int q16 = 16;
  private static final int q17 = 17;
  private static final int q18 = 18;
  private static final int q19 = 19;
  private static final int q20 = 20;
  private static final int q21 = 21;
  private static final int q22 = 22;
  private static final int q23 = 23;
  private static final int q24 = 24;
  private static final int q25 = 25;
  private static final int q26 = 26;
  private static final int q27 = 27;
  private static final int q28 = 28;
  private static final int q29 = 29;
  private static final int q30 = 30;
  private static final int q31 = 31;
  private static final int q32 = 32;
  private static final int q33 = 33;
  private static final int q34 = 34;
  private static final int q35 = 35;
  private static final int q36 = 36;
  private static final int q37 = 37;
  private static final int q38 = 38;
  private static final int q39 = 39;
  private static final int q40 = 40;

  private int state;

  /*
   * Transition Function
   * 
   * This function creates an array that represents the possible transitions at
   * each state
   * 
   * The columns of this array represent the numbers 0-9
   */
  static private int[][] delta = { { q2, q2, q29, q1, q6, q27, q22, q2, q2, q2 }, // q0
      { q2, q2, q2, q2, q3, q2, q2, q4, q2, q2 }, // q1
      { q2, q2, q2, q2, q2, q2, q2, q2, q2, q2 }, // q2
      { q5, q5, q5, q5, q5, q5, q5, q5, q5, q5 }, // q3
      { q5, q5, q5, q5, q5, q5, q5, q5, q5, q5 }, // q4
      { q10, q10, q10, q10, q10, q10, q10, q10, q10, q10 }, // q5
      { q7, q7, q7, q7, q7, q7, q7, q7, q7, q7 }, // q6
      { q8, q8, q8, q8, q8, q8, q8, q8, q8, q8 }, // q7
      { q9, q9, q9, q9, q9, q9, q9, q9, q9, q9 }, // q8
      { q10, q10, q10, q10, q10, q10, q10, q10, q10, q10 }, // q9
      { q11, q11, q11, q11, q11, q11, q11, q11, q11, q11 }, // q10
      { q12, q12, q12, q12, q12, q12, q12, q12, q12, q12 }, // q11
      { q13, q13, q13, q13, q13, q13, q13, q13, q13, q13 }, // q12
      { q14, q14, q14, q14, q14, q14, q14, q14, q14, q14 }, // q13
      { q15, q15, q15, q15, q15, q15, q15, q15, q15, q15 }, // q14
      { q16, q16, q16, q16, q16, q16, q16, q16, q16, q16 }, // q15
      { q17, q17, q17, q17, q17, q17, q17, q17, q17, q17 }, // q16
      { q18, q18, q18, q18, q18, q18, q18, q18, q18, q18 }, // q17
      { q19, q19, q19, q19, q19, q19, q19, q19, q19, q19 }, // q18
      { q20, q20, q20, q20, q20, q20, q20, q20, q20, q20 }, // q19
      { q21, q21, q21, q21, q21, q21, q21, q21, q21, q21 }, // q20
      { q2, q2, q2, q2, q2, q2, q2, q2, q2, q2 }, // q21
      { q23, q2, q2, q2, q2, q26, q2, q2, q2, q2 }, // q22
      { q2, q24, q2, q2, q2, q2, q2, q2, q2, q2 }, // q23
      { q2, q25, q2, q2, q2, q2, q2, q2, q2, q2 }, // q24
      { q10, q10, q10, q10, q10, q10, q10, q10, q10, q10 }, // q25
      { q8, q8, q8, q8, q8, q8, q8, q8, q8, q8 }, // q26
      { q2, q28, q28, q28, q28, q28, q2, q2, q2, q2 }, // q27
      { q8, q8, q8, q8, q8, q8, q8, q8, q8, q8 }, // q28
      { q2, q2, q30, q32, q33, q34, q35, q36, q2, q2 }, // q29
      { q2, q2, q31, q31, q31, q31, q31, q31, q31, q31 }, // q30
      { q9, q9, q9, q9, q9, q9, q9, q9, q9, q9 }, // q31
      { q8, q8, q8, q8, q8, q8, q8, q8, q8, q8 }, // q32
      { q8, q8, q8, q8, q8, q8, q8, q8, q8, q8 }, // q33
      { q8, q8, q8, q8, q8, q8, q8, q8, q8, q8 }, // q34
      { q8, q8, q8, q8, q8, q8, q8, q8, q8, q8 }, // q35
      { q37, q38, q39, q2, q2, q2, q2, q2, q2, q2 }, // q36
      { q9, q9, q9, q9, q9, q9, q9, q9, q9, q9 }, // q37
      { q9, q9, q9, q9, q9, q9, q9, q9, q9, q9 }, // q38
      { q40, q2, q2, q2, q2, q2, q2, q2, q2, q2 }, // q39
      { q10, q10, q10, q10, q10, q10, q10, q10, q10, q10 }// q40

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
   * When the state is equivalent to q21, the accepted boolean will be true and
   * the DFA will be in an accepting state.
   */
  public boolean accepted() {
    return state == q21;
  }

  /*
   * Process Function
   * 
   * This function processes the input given and determines the path to be taken
   * through the DFA.
   * 
   * Parameters: in: the string given to the command line c: the character being
   * evaluated
   * 
   * Each number of the input is read one at a time and the transition function is
   * referenced to determine the next state to go to.
   * 
   * If the number is not accepted depending on the different companies' valid
   * credit card numbers, then the state will transition to q2, the error state.
   */
  public void process(String in) {
    for (int i = 0; i < in.length(); i++) {
      char c = in.charAt(i);
      try {
        if (c == '0') {
          state = delta[state][0];
        } else if (c == '1') {
          state = delta[state][1];
        } else if (c == '2') {
          state = delta[state][2];
        } else if (c == '3') {
          state = delta[state][3];
        } else if (c == '4') {
          state = delta[state][4];
        } else if (c == '5') {
          state = delta[state][5];
        } else if (c == '6') {
          state = delta[state][6];
        } else if (c == '7') {
          state = delta[state][7];
        } else if (c == '8') {
          state = delta[state][8];
        } else if (c == '9') {
          state = delta[state][9];
        }
      } catch (ArrayIndexOutOfBoundsException ex) {
        state = q2;
      }
    }
  }
}
