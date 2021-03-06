package com.bridge.deckcard.linklist;

public class LinkList<T> {
public LinkedListNode<T> first = null;
public LinkedListNode<T> ptr1, ptr2;
	/**
	 * Insert at the front of the list
	 * @param node
	 */
	public void insert(LinkedListNode<T> node) {
		node.setNext(first);
		first = node;
	}

	/**
	 * Insert at the front of the list
	 * @param node
	 */
	public void insertLast(LinkedListNode<T> node) {
		if(first == null)
			first = node;
		else {
			LinkedListNode<T> temp = first;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;
		}
	}
	
	
	/**
	 * Remove from the front of the list
	 * @param node
	 */
	public String remove(){
		LinkedListNode<T> temp = first;
		if(first.getNext()!=null)
			first = first.getNext();
		else 
			first = null;
		return (String)temp.value;
	}
	
	/**
	 * Remove from the last of the list
	 * @param node
	 * @return 
	 */
	public String removeLast(){
		LinkedListNode<T> temp = first;
		ptr2 = first;
		while (ptr2.next != null) {
			ptr1 = ptr2;
			ptr2 = ptr1.next;
		}
		ptr1.next = null;
		return (String) ptr2.value;
	}
	
	
	/**
	 * Recursively traverse this list and print the node value
	 * @param node
	 */
	private void printList(LinkedListNode<T> node) {
		System.out.println("Node is " + node.getValue());
		if(node.getNext()!=null) printList(node.getNext());
	}

	public void print(){
		printList(first);
	}
}
