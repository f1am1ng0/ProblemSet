import java.util.Stack;

public class D {
    public static void main(String[] args) {
        System.out.println(isProperly("())()"));
    }

    static boolean isProperly(String sequence){
        Stack<Character> stk = new Stack<>();

        for (int i=0; i<sequence.length(); i++) {
            if (stk.empty()) {
                stk.push(sequence.charAt(i));
                continue;
            }
            if (sequence.charAt(i) == '(') {
                stk.push(sequence.charAt(i));
            }
            if (sequence.charAt(i) == ')' && stk.peek() == '(') {
                stk.pop();
            }
        }
        if (sequence.length() / 2 == 1) {
            return false;
        }
        if (stk.empty()) {
            return true;
        }
        return false;
    }
}
