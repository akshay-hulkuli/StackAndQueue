package com.bridgelabz.stackandqueue;

import com.bridgelabz.linkedlist.*;

public class MyStack<K> {
	private MyLinkedList<K> myLinkedList;
	
	public MyStack() {
		myLinkedList = new MyLinkedList<K>();
	}
	
	public void push(MyNode<K> newNode) {
		myLinkedList.add(newNode);
	}
	
	public void display() {
		myLinkedList.display();
	}
}
