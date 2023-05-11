import java.util.Stack;

public class InToPo {

	private static int priority(char operator) {
		switch (operator) {
		case '$':
			return 3;
		case '*':
			return 2;
		case '/':
			return 2;
		case '%':
			return 2;
		case '+':
			return 1;
		case '-':
			return 1;
		}
		return -1;
	}

	public static String infixToPostfix(String infix) {
		Stack<Character> stk = new Stack();
		StringBuilder post = new StringBuilder();
		for (int i = 0; i < infix.length(); i++) {
			char sym = infix.charAt(i);
			if (Character.isDigit(sym))
				post.append(sym);
			else if (sym == '(')
				stk.push(sym);
			else if (sym == ')') {
				while (stk.peek() != '(')
					post.append(stk.pop());
				stk.pop();
			} else {
				while (!stk.isEmpty() && priority(stk.peek()) >= priority(sym))
					post.append(stk.pop());
				stk.push(sym);
			}
		}
		while (!stk.isEmpty())

			post.append(stk.pop());
		return post.toString();

	}

	public static void main(String[] args) {
		String infix = "5+9-4*(8-6/2)+1$(7-3)";
		String postfix = infixToPostfix(infix);
		System.out.println("infix :" + infix);
		System.out.println("postfix :" + postfix);
	}

}
