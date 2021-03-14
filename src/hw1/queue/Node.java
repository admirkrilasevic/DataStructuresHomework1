package hw1.queue;

//Definition of class Node for implementation of QueueWithLinkedLists
public class Node<Item> {
	Item data;
	Node<Item> next;
	
	//Class constructor to create a new node
	public Node(Item data){
		this.data = data;
		this.next = null;
	}
}
