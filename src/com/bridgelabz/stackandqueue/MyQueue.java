package com.bridgelabz.stackandqueue;

import com.bridgelabz.linkedlist.*;

public class MyQueue<K> {
private MyLinkedList<K> myLinkedList;
	
	public MyQueue() {
		myLinkedList = new MyLinkedList<K>();
	}
	
	public void enqueue(MyNode<K> newNode) {
		myLinkedList.append(newNode);
	}
	
	public void display() {
		myLinkedList.display();
	}
}
