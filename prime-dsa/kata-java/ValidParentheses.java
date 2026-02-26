import java.util.Stack;

public class ValidParentheses {

  public static boolean isValid(String s) {

    Stack<Character> stack = new Stack<>();

    for (char c : s.toCharArray()) {

      if (c == '(' || c == '{' || c == '[') {
        stack.push(c); // push opening bracket
      } else {

        if (stack.isEmpty()) {
          return false; // no matching opening bracket
        }

        char top = stack.pop();

        if ((c == ')' && top != '(') ||
            (c == '}' && top != '{') ||
            (c == ']' && top != '[')) {
          return false;
        }
      }
    }

    return stack.isEmpty(); // valid only if nothing left
  }

  public static void main(String[] args) {
    System.out.println(isValid("({[]})")); // true
    System.out.println(isValid("({[})")); // false
  }
}
