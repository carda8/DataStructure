package test;
import java.util.Scanner;

public class FactRecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���丮���� ���� ������ �Է��ϼ���");
		input = scanner.nextInt();
		
		System.out.println(fact(input));
	}
	
	public static int fact(int n) {
		if(n<=1)
			return n;
		else
			return fact(n-1)*n;
	}

}
