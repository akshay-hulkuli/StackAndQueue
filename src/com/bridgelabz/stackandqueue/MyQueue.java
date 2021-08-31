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
	
	public MyNode<K> dequeue(){
		return myLinkedList.pop();
	}
	
	public int size() {
		return myLinkedList.size();
	}
	
	public boolean isEmpty() {
		if(myLinkedList.size() == 0) return true;
		return false;
	}
	
	public void display() {
		myLinkedList.display();
	}
}
