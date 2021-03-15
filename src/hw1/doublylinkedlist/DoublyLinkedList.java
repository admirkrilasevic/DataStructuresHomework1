package hw1.doublylinkedlist;

import java.util.Iterator;


public class DoublyLinkedList<Item> implements Iterable<Item> {
	
	private Node<Item> head;
	private Node<Item> tail;
	private int size;
	
	//Constructor setting default values
	public DoublyLinkedList() {
		this.head = this.tail = null;
		this.size = 0;
	}
	
	//Add new node at the front of the list
    public void addToFront(Item item) {
    	//Create a new node and add data through constructor
        Node<Item> newNode = new Node<Item>(item);
        //If the list is empty, head and tail point to newNode  
        if(head == null) {  
            head = tail = newNode;  
            //head's previous will be null  
            head.previous = null;  
            //tail's next will be null  
            tail.next = null;  
        }
        else {
        	//head's previous points to newNode
            head.previous = newNode;
            //newNode's next points to head
            newNode.next = head;
            //newNode's previous points to null
            newNode.previous = null;
            //newNode set as head
            head = newNode;  
        }
        //Records increase of number of items in list
        size++;                                
    }
	
    
    //Add new node at the end of the list
	public void addToRear(Item item) {  
        //Create a new node and add data through constructor
        Node<Item> newNode = new Node<Item>(item);
        //If the list is empty, head and tail point to newNode  
        if(head == null) {  
            head = tail = newNode;  
            //head's previous will be null  
            head.previous = null;  
            //tail's next will be null  
            tail.next = null;  
        }  
        else {  
            //tail's next set to newNode  
            tail.next = newNode;  
            //newNode's previous set to tail  
            newNode.previous = tail;   
            //newNode's next point to null  
            newNode.next = null;
            //newNode becomes new tail  
            tail = newNode; 
        }  
        //Records decrease of number of items in list
        size++;
    }
	
	//Remove first node from list
    public void removeFromFront() {
        if (head == null) {
        	//Throw exception if list is empty
            throw new IndexOutOfBoundsException("The doubly linked list is empty.");   
        }
        else if (size == 1) {
        	//If there is only 1 node, set head and tail to null
            head = tail = null;                                                        
        } 
        else {
        	//head points to the next node
            head = head.next;
            //head's previous is set to null, thus removing first node
            head.previous = null;
        }
        //List size decreased
        size--;                                                                 
    }
    
    //Remove last node from list
    public void removeFromRear() {
        if (head == null) { 
        	//Throw exception if list is empty
            throw new IndexOutOfBoundsException("The doubly linked list is empty.");   
        } 
        else if (size == 1) {
        	//If there is only 1 node, set head and tail to null
            head = tail = null;                                                        
        } 
        else {                                                                
            //tail points to previous node
        	tail = tail.previous;
        	//tail's next is set to null, thus removing last node
        	tail.next = null;
        }
        //List size decreased
        size--;                                                                 
    }
    
    //Return list size - number of items in list
    public int count() {
        return size;
    }
    
    //Return Iterator object
    public Iterator<Item> iterator() {
        return new DoublyLinkedListIterator();
    }
    
    //Define the Iterator class, with hasNext() and next() methods
    private class DoublyLinkedListIterator implements Iterator<Item> {        
        Node<Item> current = head;                                      
        
        public boolean hasNext() {                                      
            return current != null;                                     
        }                                                               
        
        public Item next() {                                            
            Item item = current.data;                                   
            current = current.next;                                     
            return item;                                                
        }
    }

}
