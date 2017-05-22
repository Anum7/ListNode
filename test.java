
public class test {
	public static void main(String[] args) {
		
		
		ListNode re= new ListNode(1); 
		
		 ListNode head=re; // make head point to the first node
		 
		 Solution n = new Solution(head); 
		 ListNode curr=head;
		 
		 curr.setNext(new ListNode(2));
		 curr=curr.getNext();
		 
		 
		 curr.setNext(new ListNode(3));
		 curr=curr.getNext();
		 
		 curr.setNext(new ListNode(4));
		 curr=curr.getNext();
		 
		 curr.setNext(new ListNode(5));
		 curr=curr.getNext();
		 
		 curr.setNext(new ListNode(6));
		 curr=curr.getNext();
		 
		 System.out.println("The original string is: ");
		 //System.out.println(n.toString());  // first way to output the original string
		 n.display(); // second way to output the original string
		 
		 re=n.oddEvenList(head);
		 
		 System.out.println("String after oddEvenList method:  ");
		 n.display();

	}

	
}
