package hw1.queue;

public class QueueWithLinkedLists<Item> {
	
	private Node<Item> head;
	private Node<Item> tail;
	private int length;
	
	//Class constructor setting default values
	public QueueWithLinkedLists() {
		this.head = this.tail = null;
		this.length = 0;
	}
	
	//Add item to back of the queue
	public void enqueue(Item item) {
		//Create new node and add data to it through constructor
		Node<Item> newNode = new Node<Item>(item);
		if (isEmpty()) {
			//If queue is empty, both head and tail point to new node
			head = tail = newNode;
			//both head's and tail's next by default points to null 
		}
		else {
			//tail is pointed to newNode, and newNode is set as the tail
			tail.next = newNode;
			tail = newNode;
		}
		//Records increase of number of items in queue
		length++;
	}
	
	//Remove item from front of the queue
	public Item dequeue() {
		if (isEmpty()) {
			//If the queue is empty, throw an exception
			throw new IndexOutOfBoundsException("Queue is empty");
		}
		//Store data from the front of queue in variable item
		Item item = head.data;
		//Move the head node to the next node in the queue
		head = head.next;
		//Records decrease of number of items in queue
		length--;
		//If the queue is now empty, set tail to null
		if (isEmpty()) {
			tail = null;
		}
		//Dequeued item returned
		return item;
	}
	
	//Checks if the queue is empty
	public boolean isEmpty() {
		return head == null;
	}
	
	
	//Returns queue size - number of items in queue
	public int size() {
		return length;
	}
	
}
