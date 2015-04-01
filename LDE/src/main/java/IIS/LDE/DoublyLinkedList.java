package IIS.LDE;

import java.util.List;

public class DoublyLinkedList<T> {

	private Node<T> firstNode, lastNode;
	
	public DoublyLinkedList(){
		this.firstNode = null;
		this.lastNode = null;
	}
	
	public Node<T> getFirstNode() {
		return firstNode;
	}
	
	public Node<T> getLastNode() {
		return lastNode;
	}
	
	public void setFirstNode(Node<T> firstNode) {
		this.firstNode = firstNode;
	}
	
	public void setLastNode(Node<T> lastNode) {
		this.lastNode = lastNode;
	}
	
	public void forwards(){
		
		Node<T> aux = this.firstNode;
		
		while(aux!=null){
			System.out.println(aux.getData());
			aux = aux.getNext();
		}
	}
	
	public void backwards(){
		
		Node<T> aux = this.lastNode;
		
		while(aux!=null){
			System.out.println(aux.getData());
			aux = aux.getPrev();
		}
	}	
	
	
	public void insertAfter(Node<T> node, Node<T> newNode){
		
		newNode.setPrev(node);
		newNode.setNext(node.getNext());
		
		if(node.getNext() == null){
			this.lastNode = newNode;
			
		}else{
			node.getNext().setPrev(newNode);
			
		}
		
		node.setNext(newNode);
		
	}
	
	public void insertBefore(Node<T> node, Node<T> newNode){
		
		newNode.setPrev(node.getPrev());
		newNode.setNext(node);
		
		if(node.getPrev() == null){
			this.firstNode = newNode;
			
		}else{
			node.getPrev().setNext(newNode);
		}
		
		node.setPrev(newNode);
	}
	
	public void insertBeginning(Node<T> newNode){
		
		if(this.firstNode == null){
			this.firstNode = newNode;
			this.lastNode = newNode;
			newNode.setPrev(null);
			newNode.setNext(null);
		}else{
			insertBefore(this.firstNode, newNode);
		}
	}
	
	public void insertEnd(Node<T> newNode){
		
		if(this.lastNode == null){
			insertBeginning(newNode);
		}else{
			insertAfter(this.lastNode, newNode);
		}
	}
	
	public void remove(Node<T> node){
		
		if(node.getPrev() == null){
			this.firstNode = node.getNext();
		}else{
			node.getPrev().setNext(node.getNext());
		}
		
		if(node.getNext() == null){
			this.lastNode = node.getPrev();
		}else{
			node.getNext().setPrev(node.getPrev());
		}
		
	}
}
