package textgen;

import java.util.AbstractList;


/** A class that implements a doubly linked list
 * 
 * @author UC San Diego Intermediate Programming MOOC team
 * @Modified Dong Pei
 * @Modified on: May. 2017
 *
 * @param <E> The type of the elements stored in the list
 */
public class MyLinkedList<E> extends AbstractList<E> {
	LLNode<E> head;
	LLNode<E> tail;
	int size;

	/** Create a new empty LinkedList, head node and tail node does not have values */
	public MyLinkedList() {			
		head = new LLNode<E>();
		tail = new LLNode<E>();
		size = 0;
		// head.prev=null, tail.next=null
		head.next = tail;
		tail.prev = head;
	}

	/**
	 * Appends an element to the end of the list
	 * @param element The element to add
	 */
	public boolean add(E element) 
	{
		if (element == null){
			throw new NullPointerException("invalid input");
		} else {
			// change next and prev in neighborhood nodes.
			LLNode<E> node = new LLNode<E>(element);
			node.next = tail;
			node.prev = tail.prev;
			tail.prev = node;
			node.prev.next = node;
			size++;
			return true;
		}
	}

	/** Get the element at position index 
	 * @throws IndexOutOfBoundsException if the index is out of bounds. */
	public E get(int index) 
	{
		if (index > size-1 || index < 0){
			throw new IndexOutOfBoundsException("invalid index number!");
		} else {
			LLNode<E> node = head;
			for (int i=0; i<=index; i++){
				node = node.next;
			}
			
			// extract data from the chosen node
			return node.data;
		}
	}

	/**
	 * Add an element to the list at the specified index
	 * @param The index where the element should be added
	 * @param element The element to add
	 */
	public void add(int index, E element ) 
	{
		/*
		LLNode<E> node = new LLNode<E>(element);
		
		if (size == 0){
			LLNode<E> nextNode = tail;
		} else {
			LLNode<E> nextNode = this.get(index);
		}
		
		
		
		node.next =
		*/
		
	}


	/** Return the size of the list */
	public int size() 
	{
		// TODO: Implement this method
		return size;
	}

	/** Remove a node at the specified index and return its data element.
	 * @param index The index of the element to remove
	 * @return The data element removed
	 * @throws IndexOutOfBoundsException If index is outside the bounds of the list
	 * 
	 */
	public E remove(int index) 
	{
		// TODO: Implement this method
		return null;
	}

	/**
	 * Set an index position in the list to a new element
	 * @param index The index of the element to change
	 * @param element The new element
	 * @return The element that was replaced
	 * @throws IndexOutOfBoundsException if the index is out of bounds.
	 */
	public E set(int index, E element) 
	{
		// TODO: Implement this method
		return null;
	}   
}

class LLNode<E> 
{
	LLNode<E> prev;
	LLNode<E> next;
	E data;

	// This constructor is useful for initiate head 
	// and tail node
	public LLNode() 
	{
		this.data = null;
		this.prev = null;
		this.next = null;
	}
	
	
	public LLNode(E e) 
	{
		this.data = e;
		this.prev = null;
		this.next = null;
	}

}
