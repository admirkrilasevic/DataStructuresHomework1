package hw1.stack;

public class StackWithResizingArrays<Item> {
	
    
	private Item[] stack;
    private int length;
    
    //Constructor setting default values
    @SuppressWarnings("unchecked")
    public StackWithResizingArrays() {
    	this.stack = (Item[]) new Object[1];
    	length = 0;
    }
    
    //Adding an item to top of stack
    public void push(Item item) {
    	//If the stack is full, double its size
    	if (stack.length == length) {
    		resize(2*stack.length);
    	}
    	//Add item to stack and records increase of number of items in stack
    	stack[length++] = item;
    }
    
    //Removing item from top of stack
    public Item pop() {
    	//If the stack is empty, throw an exception
    	if (isEmpty()) {                                                    
            throw new IndexOutOfBoundsException("The stack is empty.");     
        }
    	//Store value from top of stack into variable item, decrease number of items in stack
        Item item = stack[--length];
        //Free the spot where the value was
        stack[length] = null;
        //If the stack is quarter full, halve its size
        if (length > 0 && length == stack.length/4) {
        	resize(stack.length/2);
        }
        //Return the popped item
        return item; 
    }
    
    //Resizing the array 
	@SuppressWarnings("unchecked")
	public void resize(int capacity) {
		//Create an array with given capacity
    	Item[] clone = (Item[]) new Object[capacity];
    	//Copy items from stack into new array
    	for (int i = 0; i < capacity; i++) {
    		clone[i] = stack[i];
    	}
    	//Set the cloned array as the new stack
    	stack = clone;
    }
	
	//Checks if stack is empty
	public boolean isEmpty() {
		return length == 0;
	}
	
	//Returns stack size - number of items in stack
	public int size() {
		return length;
	}

}
