package Utility;

import com.bridge.commercialdataprosessing.CommercialCompanyProj;
import com.bridge.commercialdataprosessing.CommercialUserProj;


public class LinkedList {
	Node head;
	
	
	
	
	/*
	 * 
	 * @@Method to add Node at Beginning of the list for CommercialCompanyProj 
	 * 
	 * 
	 * */
	 public void add(CommercialCompanyProj comShareProject) {
		NodeCompany node = new NodeCompany(comShareProject, null);
		//NodeCompany head = 
		if(head == null) {
			head = node;
		}else {
			node.next = (NodeCompany) head;
			head = node;
		}
	}
	
	 
	 /*
		 * 
		 * @@Method to add Node at Beginning of the list for CommercialUserProj 
		 * 
		 * 
		 * */
		 public void add(CommercialUserProj userShareProject) {
			NodeUser node = new NodeUser(userShareProject, null);
			if(head == null) {
				head = node;
			}else {
				node.next = (NodeUser) head;
				head = node;
			}
		}
	 
	 /*
		 * 
		 * @@Method to add Node at Ending of the list
		 * 
		 * 
		 * */
	 public void addLast(CommercialCompanyProj comShareProject) {
			NodeCompany node = new NodeCompany(comShareProject, null);
			if(head == null) {
				head = node;
			}else {
				NodeCompany temp = (NodeCompany) head;
				while(temp.next != null){
					temp = temp.next;
				}
				temp.next = node;
			}
		}
	
	
	/*
	 * 
	 * @@Method to Search a element in a list
	 * 
	 * 
	 * */
	 public boolean search(CommercialCompanyProj csp) {
		NodeCompany temp = (NodeCompany) head;
		do {
			if(temp.comShareProject.getStockName().equalsIgnoreCase(csp.getStockName())) {
				return true;
			}
			temp = temp.next;
		}while(temp.next != null);
		if(temp.comShareProject.getStockName().equalsIgnoreCase(csp.getStockName())) {
			return true;
		}
		return false;
	}
	
	
	/*
	 * 
	 * @@Method to Show a element in a list
	 * 
	 * 
	 * */
	public void show() {
		if(head == null) {
			System.out.println("List is empty ");
		}else {
			
			
			if(head instanceof NodeCompany) {
				NodeCompany temp;
				temp = (NodeCompany) head;
				while(temp.next != null) {
					System.out.println(temp.comShareProject);
					temp = temp.next;
				}
				System.out.println(temp.comShareProject);
			}else {
				NodeUser temp;
				temp = (NodeUser) head;
				while(temp.next != null) {
					System.out.println(temp.userShareProject);
					temp = temp.next;
				}
				System.out.println(temp.userShareProject);
			}
			
			
		}
	}
	
		/*
		 * 
		 * @@Method to Remove a element in a list
		 * 
		 * 
		 * */
	 public void remove(CommercialCompanyProj csp) {
			NodeCompany ptr1, ptr2;
			ptr1 = ptr2 = (NodeCompany) head;
			if (ptr1 == null) {
				System.err.println(" Underflow ");
			} else {
				while (ptr1.next != null) {
					if (ptr1.next == null) {
						head = null;
					} else {
						if (ptr1 == ptr2 && ptr2.comShareProject.getStockName().equalsIgnoreCase(csp.getStockName())) {
							head = ptr1.next;
						}
						if (ptr2.comShareProject.getStockName().equalsIgnoreCase(csp.getStockName())) {
							ptr1.next = ptr2.next;
						}
						ptr1 = ptr2;
						ptr2 = ptr1.next;
					}
				}
			}

		}
	
	 
	 /*
		 * 
		 * @@Method to Remove Node at LAST of the list
		 * 
		 * 
		 * */
		public void removeLast() {
			if(head == null) {
				System.out.println("List is Empty");
			}else {
				NodeCompany ptr1, ptr2 = null;
				ptr1 = (NodeCompany) head;
				while(ptr1.next != null) {
					ptr2 = ptr1;
					ptr1 = ptr1.next;
				}
				ptr2.next = null;
			}
		}
	
}
