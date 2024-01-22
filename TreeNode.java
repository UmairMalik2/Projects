public class TreeNode<E extends Comparable<E>> {
	protected E element;
	protected TreeNode<E> left;
	protected TreeNode<E> right;
	protected Node<Article> head; 

	public TreeNode(E e) {
		element = e;
	}
	
	public void addFirst(Article a) {
	    Node<Article> newNode = new Node<Article>(a);
	    newNode.next = head;
	    head = newNode;
	}
}