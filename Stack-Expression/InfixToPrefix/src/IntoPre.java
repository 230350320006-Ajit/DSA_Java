import java.util.Stack;

public class IntoPre {
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

	public static String infixToPrefix(String infix) {
		Stack<Character> stk = new Stack();
		StringBuilder prefix = new StringBuilder();
		for (int i =infix.length()-1;i>=0; i--) {
			char sym = infix.charAt(i);
			if (Character.isDigit(sym))
				prefix.append(sym);
			else if (sym == ')')
				stk.push(sym);
			else if (sym == '(') {
				while (stk.peek() != ')')
					prefix.append(stk.pop());
				stk.pop();
			} else {
				while (!stk.isEmpty() && priority(stk.peek()) > priority(sym))
					prefix.append(stk.pop());
				stk.push(sym);
			}
		}
		while (!stk.isEmpty())

			prefix.append(stk.pop());
		return prefix.reverse().toString();

	}

	public static void main(String[] args) {
		String infix = "2+7-4*(1-4/2)+2$(5-3)";
		String prefix = infixToPrefix(infix);
		System.out.println("infix : " + infix);
		System.out.println("postfix : " + prefix);
	}
}
