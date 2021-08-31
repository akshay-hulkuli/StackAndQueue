package com.bridgelabz.stackandqueue;

import com.bridgelabz.linkedlist.MyNode;

public class StackAndQueueMain {
	public static void main(String[] args) {
		MyQueue<Integer> myQueue = new MyQueue<Integer>();
		
		MyNode<Integer> firstNode = new MyNode<Integer>(56);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		MyNode<Integer> thirdNode = new MyNode<Integer>(70);
		
		myQueue.enqueue(firstNode);
		myQueue.enqueue(secondNode);
		myQueue.enqueue(thirdNode);
		
		System.out.println("The content of Queue starting from top : ");
		myQueue.display();
		
		
		
	}
}
