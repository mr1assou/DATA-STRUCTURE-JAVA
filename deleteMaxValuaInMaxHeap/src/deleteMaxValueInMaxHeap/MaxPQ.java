package deleteMaxValueInMaxHeap;

import java.util.Arrays;

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
	public void insert(int x) {
		if(n==heap.length-1) {
			resize(heap.length*2);
		}
		n++;
		heap[n]=x;
		swim(n);
	}
	public void resize(int n) {
		int temp[]=new int[n];
		for(int i=0;i<heap.length;i++) {
			temp[i]=heap[i];
		}
		heap=temp;
	}
	public void swim(int k) {
		while(k>1 && heap[k/2]<heap[k]) {
			int temp=heap[k/2];
			heap[k/2]=heap[k];
			heap[k]=temp;
			k/=2;
		}
	}
	public void display() {
		for(int i=1;i<=n;i++) {
			System.out.println(heap[i]);
		}
	}
	public void deleteMax() {
		swap(1,n);
		n--;
		sink(1);
	}
	public void sink(int k) {
		while(2*k<=n) {
			int j=2*k;
			if(j<n && heap[j]<heap[j+1]) {
				j++;
			}
			if(heap[k]>=heap[j]) {
				break;
			}
			swap(k,j);
			k=j;
		}
	}
	public void swap(int position,int size) {
		int temp=heap[position];
		heap[position]=heap[size];
		heap[size]=temp;
	}
	public static void main(String[] args) {
		MaxPQ pq=new MaxPQ(7);
		pq.insert(9);
		pq.insert(3);
		pq.insert(6);
		pq.insert(2);
		pq.insert(1);
		pq.insert(5);
		pq.insert(4);
		pq.deleteMax();
		pq.display();
		
	}
}
