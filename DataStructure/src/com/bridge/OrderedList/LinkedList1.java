package com.bridge.OrderedList;

import com.bridge.OrderedList.Node;

public class LinkedList1 {

	Node head;
	Node p1, p2;

	/********
	 * 
	 * 
	 * @@@@@Method to add elemen in sorted order
	 * 
	 * 
	 ********/
	public void add(int data) {
		Node node = new Node(data, null);
		/*
		 * When list is empty
		 */
		if (head == null) {
			head = node;
		} else {

			/*
			 * @@@When there is a single element in LinkedList
			 */
			if (head.next == null) {
				if (head.data > node.data) {
					node.next = head;
					head = node;
				} else {
					head.next = node;
				}
			} // if
			else {
				/*
				 * @@@When there is a more then two element in LinkedList
				 * 
				 */
				p1 = head;
				p2 = p1.next;
				// System.out.println("SHubham");
				while (p1.next != null) {
					
					if (p1.data > node.data && p1 == head) {
						node.next = head;
						head = node;
					}
					
					if (p1.data < node.data && p2.data > node.data) {
						node.next = p1.next;
						p1.next = node;
					}

					if (p2.next == null && p2.data < node.data) {
						p2.next = node;
					}

					p1 = p2;
					p2 = p1.next;
				} // while
			} // else
		} // else

	}// add

	public void remove(int data) {
		Node ptr1, ptr2;
		ptr1 = ptr2 = head;
		if (ptr1 == null) {
			System.err.println(" Underflow ");
		} else {
			if (ptr1.next == null) {
				head = null;
			}
			while (ptr1.next != null) {
					if (ptr1 == ptr2 && ptr2.data == data) {
						head = ptr1.next;
					}
					if (ptr2.data == data) {
						ptr1.next = ptr2.next;
					}
					ptr1 = ptr2;
					ptr2 = ptr1.next;
			}
		}

	}

	/*
	 * 
	 * @@Method to display LinkedList element
	 * 
	 * 
	 * 
	 */
	public void show() {
		if (head == null) {
			System.out.println("List is empty ");
		} else {
			Node temp;
			temp = head;
			System.out.print("[");
			while (temp.next != null) {
				System.out.print(temp.data + ", ");
				temp = temp.next;
			}
			System.out.println(temp.data+"]");
		}
	}
	
	/*
	 * 
	 * @@Method to Check Lisy is empty or not
	 * 
	 * 
	 */
	public boolean isEmpty() {
		if(this.head == null)
			return true;
		return false;
	}
	/*
	 * 
	 * @@Method to Search a element in a list
	 * 
	 * 
	 */
	public boolean search(int num) {
		Node temp = head;
		if (head == null) {
			return false;
		}
		while (temp.next != null){
			if (temp.data == num) {
				return true;
			}
			temp = temp.next;
		} 
		if (temp.data == num) {
			return true;
		}
		return false;
	}
//remove last element in list
	public int removeLast() {
		int temp = 0;
		if(head == null) {
			System.out.println("List is Empty");
		}else {
			Node ptr1, ptr2 = null;
			ptr1 = head;
			while(ptr1.next != null) {
				ptr2 = ptr1;
				ptr1 = ptr1.next;
			}
			temp = ptr1.data;
			if(head.next == null) {
				head = null;
			}else {
				ptr2.next = null;
			}
		}
		return temp;
	}
//remove First element in a list

	public int removeFirst() {
		int temp = 0;
		if(head == null) {
			System.out.println("Empty list");
		}else {
			temp = head.data;
			head = head.next;
		}
		return temp;
	}
	
}
