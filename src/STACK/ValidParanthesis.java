package STACK;

import java.util.*;

class ValidParanthesis {

    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for (char ch : s.toCharArray()) {

            // opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            }
            // closing brackets
            else {
                if (st.isEmpty()) return false;

                char top = st.pop();

                if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return st.isEmpty();
    }

    public static void main(String[] args) {
        String s = "({[]})";   // test input
        System.out.println(isValid(s));
    }
}