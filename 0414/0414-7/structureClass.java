package d0414_7;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class structureClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> que = new LinkedList<String>();
		Stack<String> stack = new Stack<String>();
		String words[] = {"�����", "jsieun73", "����������", "level", "�ȳ��ϼ���"};
		char queS = 0;
		
		System.out.println("ť ���� �����Դϴ�");
		for(int i = 0; i<5; i++) {
			for(int j=0; j<words[i].length(); j++) {
				queS = words[i].charAt(j);
				que.offer(""+queS);
				stack.push(""+queS);
			}
			for(int k=0; k<words[i].length(); k++) {
				if(que.remove().equals(stack.pop()) && k == words[i].length()-1)
					System.out.println(words[i] + "\t : ȸ��");
				else if(k==words[i].length()-1)
					System.out.println(words[i]+"\t : ȸ���ƴ�");
			}
		}
	}

}