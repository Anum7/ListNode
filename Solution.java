public class Solution {
		private ListNode Head;
		private int listCount;
		
		public Solution(){
			Head = null;
			listCount = 0;
		}
		// post: returns the number of elements in this list.
		public Solution(ListNode head){
			this.Head = head;
			listCount = 0;
		}
		
		public void display(){
	    	if(Head.getNext()==null){
	    		System.out.println("the Linked list is empty");
	    	}
	    	else{
	    		ListNode curr=Head;
	    		while(curr!=null){
	    			System.out.print(curr.getVal()+ " ");
	    			curr=curr.getNext();
	    		}
	    		System.out.println();
	    		}
	    	}
		
		//group all nodes with odd index first followed by the nodes with even index.
		public ListNode oddEvenList(ListNode head) {
			
			if(head==null){
				return head;
			}
			this.Head=head;
			ListNode newNode = new ListNode();
			ListNode odd = head;
			ListNode even = head.next;
			ListNode newNode1 = head.next;
			while(odd!= null && even!=null){
				ListNode tmp = even.next;
				if(tmp==null)
					break;
				
				odd.next = even.next;
				odd= odd.next;
				
				even.next = odd.next;
				even = even.next;
			}
			odd.next = newNode1; 
			return newNode;

	}



}
