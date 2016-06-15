package com.jay.heap;

public class Heaps {
	int [] heap ;
	int size ;
	int marker = 0;
	
	public Heaps(int size) {
		this.size = size;
		heap = new int[size];
	}

	public void insert(int a) {
		if(marker > size) {

		}
		else {
			heap[++marker] = a ;
			int currentElement = marker;
			while (heap[getParent(currentElement)] > heap[currentElement]) {
				int parent = getParent(currentElement);
				swap(parent,currentElement);
				currentElement = getParent(currentElement);
			}
		}
	}
	
	private void swap(int parent, int child) {

		int temp = heap[parent];
		heap[parent] = heap[child];
		heap[child] = temp;
	}

	public int getParent(int pos) {
		return pos/2;
	}
	
	public int getLeftChild(int pos) {
		return 2*pos;
	}
	
	public int getRightChild(int pos) {
		return 2*pos + 1;
	}
	
	public int getMinimum() {
		
		return heap[0];
	}
	
	public int deleteMinimum() {
		
		int deletedItem = heap[1];
		heap[1] = heap[marker];
		heap[marker--] = 0;
		heapify(1);
		
		return deletedItem;
	}
	
	public void display() {
		for(int i = 1 ; i < marker/2 ; i++) {
			System.out.println("Parent "+heap[i]+" ::  Children "+heap[2*i]+" "+heap[2*i+1] );
		}
	}
	
	public void heapify(int pos) {
		if(pos >= marker / 2) 
			return;
		else if(heap[pos] > heap[getLeftChild(pos)] || heap[pos] > heap[getRightChild(pos)]) {
			if(heap[getLeftChild(pos)] < heap[getRightChild(pos)]) {
				swap(pos,getLeftChild(pos));
				heapify(getLeftChild(pos));
			}
			else {
				swap(pos,getRightChild(pos));
				heapify(getRightChild(pos));
			}
			
		}
	}
	
}
