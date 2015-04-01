package IIS.LDE;

public class Node<T> {

	private T data;
	private Node<T> prev, next;
	
	public Node(T d, Node<T> p, Node<T> n){
		
		this.data = d;
		this.next = n;
		this.prev = p;
	}
	
	public T getData() {
		return data;
	}
	
	public Node<T> getNext() {
		return next;
	}
	
	public Node<T> getPrev() {
		return prev;
	}
	
	public void setNext(Node<T> next) {
		this.next = next;
	}
	
	public void setPrev(Node<T> prev) {
		this.prev = prev;
	}
	
}
