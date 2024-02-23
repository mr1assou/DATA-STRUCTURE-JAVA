package maxPriorityQueue;

public class MaxPQ {
	private int[] heap;
	private int n;
	public MaxPQ(int capacity) {
		heap=new int[capacity+1]; //because index 0 should be empty
		n=0;
	}
	public boolean isEmpty() {
		return n==0;
	}
	public int size() {
		return n;
	}
	public static void main(String[] args) {
		MaxPQ pq=new MaxPQ(3);
		System.out.println(pq.size());
		System.out.println(pq.isEmpty());
	}
}
