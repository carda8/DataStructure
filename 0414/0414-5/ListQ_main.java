package d0414_5;

public class ListQ_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListQueue<String> q = new ListQueue<>();
		
		q.add("apple"); q.add("orange");
		q.add("cherry"); q.add("pear");
		q.print();
		
		
		q.remove(); q.print();
		q.remove(); q.print();
		
		q.add("grape"); q.print();
	}

}
