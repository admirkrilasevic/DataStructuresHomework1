package hw1;

import hw1.doublylinkedlist.DoublyLinkedList;
import hw1.queue.QueueWithLinkedLists;
import hw1.stack.StackWithResizingArrays;

public class Main {

	public static void main(String[] args) {
		 
	    DoublyLinkedList<Integer> list = new DoublyLinkedList<Integer>();
	        
	    list.addToRear(1);
	    list.addToRear(2);
	    list.addToRear(3);
	    list.addToRear(4);
	    list.addToFront(5);
	    list.addToFront(6);
	        
	    list.removeFromRear();
	    list.removeFromFront();
	        
	    for (Integer i: list) {
	        System.out.println(i);
	    }
	        
	    System.out.println("list size: " + list.count());*/
	    
	    StackWithResizingArrays<Integer> stack = new StackWithResizingArrays<Integer>();
        
	    stack.push(2);
	    stack.push(8);
	    stack.push(5);
	        
	    System.out.println(stack.pop());
	    System.out.println(stack.pop());
	    System.out.println(stack.pop());
	        
	    stack.push(10);
	    System.out.println("stack size: " + stack.size());
		
	    QueueWithLinkedLists<Integer> queue = new QueueWithLinkedLists<Integer>();
	    
	    queue.enqueue(1);
	    queue.enqueue(2);
	    queue.enqueue(3);
	        
	    System.out.println(queue.dequeue());
	    System.out.println(queue.dequeue());
	    System.out.println(queue.dequeue());
	    queue.enqueue(4);
	        
	    System.out.println("queue size: " + queue.size());

	}

}
