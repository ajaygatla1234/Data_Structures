
import java.util.Stack;

public class Infix_to_Postfix {
	
	public static int precedence(char op) {
		switch (op) {
		case '^':return 3;
		case '/':
		case '*':return 2;
		case '+':
		case '-':return 1;
		}
		return -1;
	}
	
	public static String infixToPostfix(String infix) {
		String postfix="";
		Stack<Character> opStack=new Stack<Character>();
		for(int i=0;i<infix.length();i++) {
			char ch=infix.charAt(i);
			if(Character.isLetterOrDigit(ch)) {
				postfix=postfix+ch;
			}
			else if(ch=='(') {
				opStack.push(ch);
			}
			else if(ch==')') {
				while(!opStack.isEmpty()&&opStack.peek()!='(') {
					postfix=postfix+opStack.pop();
				}
				opStack.pop();
			}
			else{
				while (!opStack.isEmpty()&&(precedence(ch)<precedence(opStack.peek()))) {
					postfix=postfix+opStack.pop();
				}
				opStack.push(ch);
			}
		}
		while (!opStack.isEmpty()) {
			postfix=postfix+opStack.pop();
		}
		return postfix;
	}
	
	public static void main(String[] args) {
		
//		String infix = "x+y*(z^p-q)";
		String infix = "a+b";
		String postfix = infixToPostfix(infix);
		System.out.println(postfix);
	}

}
