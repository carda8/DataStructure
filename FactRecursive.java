package test;
import java.util.Scanner;

public class FactRecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("팩토리얼을 구할 정수를 입력하세요");
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
