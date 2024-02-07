
package delete_node_given_position;

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