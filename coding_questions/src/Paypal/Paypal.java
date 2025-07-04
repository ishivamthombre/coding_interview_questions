package Paypal;


import java.util.*;

public class Paypal {
  public static boolean isBalanced(String exp) {
    Stack<Character> stack = new Stack<>();

    for (char ch : exp.toCharArray()) {
      if (ch == '(' || ch == '{' || ch == '[') {
        stack.push(ch);
      } else if (ch == ')' || ch == '}' || ch == ']') {
        if (stack.isEmpty()) {
          return false;
        }
        char top = stack.pop();
        if (!isMatchingPair(top, ch)) {
          return false;
        }
      }
    }
    return stack.isEmpty();
  }

  public static boolean isMatchingPair(char openCh, char closeCh) {
    return ((openCh == '(' && closeCh == ')') || (openCh == '{' && closeCh == '}') || (openCh == '[' && closeCh == ']'));
  }

  public static void main(String[] args) {
    String input = "{[{()}]}";

    if (isBalanced(input)) {
      System.out.println("Balanced : " + input);
    } else {
      System.out.println("Not Balanced : " + input);
    }
  }
}
