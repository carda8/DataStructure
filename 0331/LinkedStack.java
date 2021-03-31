package stack;

public class LinkedStack implements Stack {
	private StackNode top;

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return (top == null);
	}

	@Override
	public void push(char item) {
		// TODO Auto-generated method stub
		top = new StackNode(item, top);
		System.out.println("Inserted Item : "+item);
	}

	@Override
	public char pop() {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			System.out.println("Deleting fail! Linked Stack is empty");
			return 0;
		}
		else {
			char item = top.data;
			top = top.link;
			return item;
		}
	}
	

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			System.out.println("Deleting fail! Linkded Stack is empty");
		}
		else {
			top = top.link;
		}
	}

	@Override
	public char peek() {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			System.out.println("Peeking fail! Linked Stack is empty!!");
			return 0;
		}
		else
			return top.data;
	}
	
	public void print() {
		if(isEmpty())
			System.out.printf("Linked Stack is empty!!!%n%n");
		else {
			StackNode temp = top;
			System.out.print("Linked Stack>>");
			while(temp != null) {
				System.out.printf("\t%c\n",temp.data);
				temp = temp.link;
			}
			System.out.println();
		}
	}

}
