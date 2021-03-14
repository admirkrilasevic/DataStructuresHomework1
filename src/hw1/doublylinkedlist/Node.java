package hw1.doublylinkedlist;

//Definition of class Node for implementation in DoublyLinkedList
public class Node<Item> {
	Item data;
	Node<Item> next;
	Node<Item> previous;
	
	public Node(Item data) {
		this.data = data;
		this.next = this.previous = null;
	}
}
