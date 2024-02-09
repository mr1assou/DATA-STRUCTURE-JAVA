package merge_two_sorted_linkedList;


public class SinglyLinkedList {
	// it's not important
				//NodeList head;
				public static class NodeList{
					int data;
					NodeList next;
					public NodeList(int data){
						this.data=data;
						this.next=null;
					}
				}
				public static void display(NodeList tip) {
					SinglyLinkedList.NodeList currentNode=tip;
					while(currentNode!=null) {
						System.out.println(currentNode.data);
						currentNode=currentNode.next;
					}
				}
}
