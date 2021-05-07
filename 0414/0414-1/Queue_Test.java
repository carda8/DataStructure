package d0414;

public class Queue_Test {

	public static void main(String[] args) {
		int queueSize = 3;
		char deleteItem;
		ArrayQueue Q = new ArrayQueue(queueSize);
		
		Q.enQueue('A');
		Q.printQueue();
		
		Q.enQueue('B');
		Q.printQueue();
		
		deleteItem = Q.deQueue();
		if(deleteItem != 0)
			System.out.println("delete Item : " + deleteItem);
		Q.printQueue();
		
		Q.enQueue('C');
		Q.printQueue();
		
		deleteItem = Q.deQueue();
		if(deleteItem != 0)
			System.out.println("deleted Item : " + deleteItem);
		Q.printQueue();
		
		deleteItem = Q.deQueue();
		if(deleteItem != 0)
			System.out.println("deleted Item : " + deleteItem);
		Q.printQueue();
		
		deleteItem = Q.deQueue();
		if(deleteItem != 0)
			System.out.println("deleted Item : " + deleteItem);
		Q.printQueue();
		
	}

}









