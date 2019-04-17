package Utility;

import com.bridge.commercialdataprosessing.CommercialCompanyProj;


public class NodeCompany implements Node{
	CommercialCompanyProj comShareProject;
	NodeCompany next;
	
	
	public NodeCompany(CommercialCompanyProj comShareProject, NodeCompany next) {
		this.comShareProject = comShareProject;
		this.next = next;
	}
	/*******************Gettter and Setter********************/
	public CommercialCompanyProj getComShareProject() {
		return comShareProject;
	}
	public void setComShareProject(CommercialCompanyProj comShareProject) {
		this.comShareProject = comShareProject;
	}
	
	public NodeCompany getNext() {
		return next;
	}
	
	public void setNext(NodeCompany next) {
		this.next = next;
	}
	
}
