import java.util.*;
//71. Simplify Path
public class SimplifyPath {
    public static String simplifyPath(String path) {

        Stack<String> stack = new Stack<>();

        String[] parts = path.split("/");

        for (String part : parts) {

            // Ignore empty parts and "."
            if (part.equals("") || part.equals(".")) {
                continue;
            }

            // ".." means go back one directory
            else if (part.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            }

            // Normal directory
            else {
                stack.push(part);
            }
        }

        // Build final path
        String result = "";

        for (String folder : stack) {
            result = result + "/" + folder;
        }

        // If nothing is left, root is "/"
        if (result.equals("")) {
            return "/";
        }

        return result;
    }

    public static void main(String[] args) {

        String path = "/home//user/../docs/./java/";

        String answer = simplifyPath(path);

        System.out.println(answer);
    }
}
