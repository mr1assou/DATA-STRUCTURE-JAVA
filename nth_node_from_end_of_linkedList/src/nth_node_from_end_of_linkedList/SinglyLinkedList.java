package nth_node_from_end_of_linkedList;

public class SinglyLinkedList {
	NodeList head;
	public static class NodeList{
		int data;
		NodeList next;
		public NodeList(int data){
			this.data=data;
			this.next=null;
		}
	}
	public void display() {
		SinglyLinkedList.NodeList currentNode=head;
		while(currentNode!=null) {
			System.out.println(currentNode.data);
			currentNode=currentNode.next;
		}
	}
}
		

