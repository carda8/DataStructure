package CircleList;

public class Clist_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Clist<String> s = new Clist<String>(); // ���� ����Ʈ ��ü s ����
		s.insert("pear"); s.insert("cherry");
		s.insert("orange"); s.insert("apple");
		s.print();
		System.out.print(": s�� ���� = "+s.size()+"\n");
		s.delete();
		s.print();
		System.out.print(" : s�� ���� = "+s.size());System.out.println();

	}

}
