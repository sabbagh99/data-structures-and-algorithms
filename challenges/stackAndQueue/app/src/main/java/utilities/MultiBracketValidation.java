package utilities;

import java.util.Stack;

public class MultiBracketValidation {
  public boolean multiBracketValidation(String input) {
    Stack<Character> stack = new Stack<>();
    if (input == "" )
      return false;

//    if(!input.contains("{") || !input.contains("[") || !input.contains("("))
//      return false;
    char bracket;

    for (int i = 0; i < input.length(); i++) {
      bracket = input.charAt(i);

      if (bracket == '(' || bracket == '{' || bracket == '[')
        if (bracket == '(') {
          stack.push(')');
        }
      if (bracket == '[') {
        stack.push(']');
      }
      if (bracket == '{') {
        stack.push('}');
      } else if (bracket == ')' || bracket == '}' || bracket == ']') {
        if (stack.isEmpty() || stack.pop() != bracket)
          return false;
      }
    }

    return stack.isEmpty();

  }
}
