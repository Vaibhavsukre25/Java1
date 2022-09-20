package linkedlist;

public class Operations {
	
	Node head;
	
	class Node{
		String data;
		Node next;
		
		Node(String data){
			this.data = data;
			this.next = null;
		}
	}
	
	// ADD 
	public void addFirst ( String data ) {
		Node newNode = new Node ( data );
		newNode.next = head ;
		head = newNode ;
	}
	
	public void addLast ( String data ) {
		Node newNode = new Node ( data );
		if ( head == null ) {
		    head = newNode ;
		    return ;
		}
		Node lastNode = head ;
		while ( lastNode . next != null ) {
		  lastNode = lastNode . next ;
		}
		 lastNode . next = newNode ;
	}
	public void printList () {
		Node currNode = head ;
		while ( currNode != null ) {
		  System . out . print ( currNode . data + " -> " );
		  currNode = currNode . next ;
		}
	System . out . println ( "null" );
	}
	
	public void removeFirst () {
		if ( head == null ) {
		  System . out . println ( "Empty List, nothing to delete" );
		  return ;
		}
		  head = this . head . next ;

	}
	public void removeLast () {
		if ( head == null ) {
		  System . out . println ( "Empty List, nothing to delete" );
		  return ;
	}
		if ( head . next == null ) {
		  head = null ;
		  return ;
		}
		  Node currNode = head ;
		  Node lastNode = head . next ;
		  while ( lastNode . next != null ) {
			    currNode = currNode . next ;
			    lastNode = lastNode . next ;
		  }
			  currNode . next = null ;
	 }
			 
	
	public static void main(String[] args) {
		
		Operations list = new Operations();
		list.addFirst("a");
		list.addFirst("is");
		list.addLast("list");
		list.printList();
		list.removeFirst();
		list.printList();
		list.removeLast();
		list.printList();
		
	}

}
