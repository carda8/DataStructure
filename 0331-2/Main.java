package stackG;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayStack<String> stack = new ArrayStack<>();
		
		stack.push("apple");
		stack.print();
		
		stack.push("orange");
		stack.print();
		
		stack.push("cherry");
		stack.print();
		
		System.out.println(stack.peek()+"\n");
		
		stack.push("pear");
		stack.print();
		
		stack.pop();
		System.out.println(stack.peek()+"\n");
		
		stack.push("grage");
		stack.print();
	}

}
