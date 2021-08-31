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
	
	public MyNode<K> pop(){
		return myLinkedList.pop();
	}
	
	public int size() {
		return myLinkedList.size();
	}
	
	public MyNode<K> peek(){
		return myLinkedList.head;
	}
	
	public boolean isEmpty() {
		if(myLinkedList.size() == 0) return true;
		return false;
	}
	
	public void display() {
		myLinkedList.display();
	}
}
