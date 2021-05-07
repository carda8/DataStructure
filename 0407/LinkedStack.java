package d0407;

public class LinkedStack implements Stack {
	private StackNode top;

	@Override
	public void delete() {
		if(isEmpty())
			System.out.println("Deleting Fail, LinkedStack is Empty");
		else
			top = top.link;
	}

	@Override
	public char peek() {
		if(isEmpty()) {
			System.out.println("Peeking Fail, LinkedStack is Empty");
			return 0;}
		return top.data;
	}

	@Override
	public char pop() {
		if(isEmpty())
			System.out.println("Deleting Fail, LinkedStack is Empty");
		else {
			char item = top.data;
			top = top.link;
			return item;
		}
		return 0;
	}

	@Override
	public void push(char item) {
		StackNode newNode = new StackNode();
		newNode.data = item;
		newNode.link = top;
		top = newNode;
	}

	@Override
	public boolean isEmpty() {
		return (top==null);
	}
	
	public void printStack() {
		if(isEmpty())
			System.out.println("LinkedStack is Empt %n%ny");
		else {
			StackNode temp = top;
			System.out.println("Linked Stack>>");
			while(temp != null) {
				System.out.printf("\t %c \n", temp.data);
				temp = temp.link;
			}
			System.out.println();
		}
	}

}
