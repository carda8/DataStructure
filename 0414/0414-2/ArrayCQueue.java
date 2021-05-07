package d0414_2;

interface Queue{
	boolean isEmpty();
	void enQueue(char item);
	char deQueue();
	void delete();
	char peek();
}


public class ArrayCQueue implements Queue{
	private int front;
	private int rear;
	private int queueSize;
	private char itemArray[];
	
	public ArrayCQueue(int queueSize) {
		front = 0;
		rear = 0;
		this.queueSize = queueSize;
		itemArray = new char[this.queueSize];
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return (front == rear);
	}
	
	public boolean isFull() {
		return (((rear+1) % this.queueSize) == front);
	}

	@Override
	public void enQueue(char item) {
		// TODO Auto-generated method stub
		if(isFull()) {
			System.out.println("Inserting fail! Array Circular Queue is full!!!");
		}
		else {
			rear = (rear+1) % this.queueSize;
			itemArray[rear] = item;
			System.out.printf("Inserted Item : ", item);
		}
	}

	@Override
	public char deQueue() {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			System.out.println("Deleting fail! Array Circular Queue is empty");
			return 0;
		}
		else {
			front = (front+1) % this.queueSize;
			return itemArray[front];
		}
		
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			System.out.println("Deletign fail!! Array Circular Queue is empty!!");
		}
		else {
			front = (front +1) % this.queueSize;
		}
	}

	@Override
	public char peek() {
		if(isEmpty()) {
			System.out.println("Peeking Fail! Array circular Queue is empty!!");
			return 0;
		}
		else
			return itemArray[(front+1) % this.queueSize];
		
	}


	public void printQueue() {
		// TODO Auto-generated method stub
		if(isEmpty())
			System.out.println("Array Circular Queue is empty!!");
		else {
			System.out.printf("array Circular Queue >>");
			for(int i=(front+1) % this.queueSize; i!=(rear+1)%this.queueSize; i=++i%this.queueSize)
				System.out.printf("%c", itemArray[i]);
			System.out.println(); System.out.println();
		}
	}
}














