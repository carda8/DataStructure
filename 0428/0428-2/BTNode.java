package d0428_2;

public class BTNode<Key extends Comparable<Key>> {
	private Key item;
	private BTNode<Key> left;
	private BTNode<Key> right;
	
	public BTNode(Key newItem, BTNode<Key> lt, BTNode<Key> rt) {
		item = newItem; left = lt; right = rt;
	}

	public Key getKey() {
		return item;
	}

	public void setItem(Key item) {
		this.item = item;
	}

	public BTNode<Key> getLeft() {
		return left;
	}

	public void setLeft(BTNode<Key> left) {
		this.left = left;
	}

	public BTNode<Key> getRight() {
		return right;
	}

	public void setRight(BTNode<Key> right) {
		this.right = right;
	}
	
	

}
