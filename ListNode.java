
public class ListNode {
	public int val;
	public ListNode next;
	//constructor 1
	ListNode(int x) { 
		val = x; 
		next = null;
		}
	/** Constructor 2
	   * Creates a node with the given element and next node. 
	   * */
	ListNode(int x, ListNode n){
		val = x;
		next = n;
	}
	//constructor 3
	ListNode(){
		
	}
	
	//Returns the element of this node.
	int getVal(){
		return val;
	}
	//Returns the next node of this node.
	ListNode getNext(){
		return next;
	}
	 // Modifier methods:
	  // Sets the element of this node.
	void setVal(int newVal){
		val = newVal;
	}
	//Sets the next node of this node. 
	void setNext(ListNode newNext){
		next = newNext;
	}
	
}
	