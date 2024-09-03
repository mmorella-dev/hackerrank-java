import java.io.*;
import java.util.*;

public class JavaStack {
    public static final Map<Character, Character> BRACE_PAIRS = Map.of('(', ')', '{', '}', '[', ']');

    public static boolean isStartBrace(char c) {
        return BRACE_PAIRS.containsKey(c);
    }

    public static boolean bracketsMatch(char c1, char c2) {
        return BRACE_PAIRS.get(c1) == c2;
    }

    public static boolean isValid(String s) {
        var stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            // opening brace
            if (isStartBrace(c)) {
                stack.push(c);
                continue;
            }
            // closing brace
            if (stack.isEmpty() || !bracketsMatch(stack.pop(), c)) {
                return false;
            }
        }
        return stack.empty();
    }

    public static void main(String[] args) {
        var bufReader = new BufferedReader(new InputStreamReader(System.in));
        bufReader.lines().forEach((l) -> {
            var isValid = isValid(l);
            System.out.println(isValid ? "true" : "false");
        });
    }
}