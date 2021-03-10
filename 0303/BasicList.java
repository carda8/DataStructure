package test;
import java.util.Scanner;

public class BasicList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 5;
		int[] num;
		int numMax = 0;
		int search;
		Boolean searchCheck = false;
		
		Scanner scanner = new Scanner(System.in);

		num = new int[count];
		
		System.out.print("5°³ÀÇ ¼ýÀÚ¸¦ ÀÔ·ÂÇÏ¼¼¿ä");
		for (int i = 0; i < count ; i++) {
			num[i] = scanner.nextInt();
		}
		

		for(int i = 0; i < count ; i++) {
			System.out.println(num[i]);
		}
		
	}

}
