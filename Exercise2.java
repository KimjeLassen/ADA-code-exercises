import java.util.Stack;

public class Exercise2 {
    public static boolean balPar(String text) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '(') {
                stack.push(text.charAt(i));
            } else if (text.charAt(i) == ')') {
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        //System.out.println(balPar("((((( )))))"));
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.getFront());
        q.remove();
        System.out.println(q.toString());
    }
}

