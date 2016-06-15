package com.jay.heap;

public class HeapCaller {

	public static void main(String[] args) {
		
		Heaps heaps = new Heaps(20);
		heaps.insert(25);
		heaps.insert(23);
		heaps.insert(22);
		heaps.insert(15);
		heaps.display();

		heaps.deleteMinimum();
		heaps.display();
		heaps.insert(13);
		heaps.insert(12);
		heaps.insert(5);
		heaps.insert(3);
		heaps.insert(2);
		
		heaps.display();
	}
}
