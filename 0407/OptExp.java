package d0407;

public class OptExp {
	private char testChar, openPair;
	private int expSize;
	private String exp;
	
	public boolean testPair(String exp) {
		this.exp = exp;
		expSize = this.exp.length();
		LinkedStack S = new LinkedStack();
		for(int i = 0 ; i < expSize; i++) {
			testChar = this.exp.charAt(i);
			switch(testChar) {
			case '(':
			case '{':
			case '[':
				S.push(testChar); break;
			case ')':
			case '}':
			case ']':
				if(S.isEmpty()) return false;
				else {
					openPair = S.pop();
					if((openPair == '(' && testChar != ')')||
					   (openPair == '{' && testChar != '}')||
					   (openPair == '[' && testChar != ']'))
						return false;
					else break;
				}
			}
		}
		if(S.isEmpty())
			return true;
		else
			return false;
		}

}
