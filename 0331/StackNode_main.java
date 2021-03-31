package stack;

public class StackNode_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char deletedItem;
		LinkedStack LS = new LinkedStack();
		
		LS.push('A');
		LS.print();
		
		LS.push('B');
		LS.print();
		
		LS.push('C');
		LS.print();
		
		deletedItem = LS.pop();
		if(deletedItem != 0)
			System.out.println("deleted Item : "+deletedItem);
		LS.print();
	}

}
