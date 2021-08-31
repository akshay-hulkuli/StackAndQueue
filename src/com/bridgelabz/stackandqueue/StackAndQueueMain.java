package com.bridgelabz.stackandqueue;

import com.bridgelabz.linkedlist.MyNode;

public class StackAndQueueMain {
	public static void main(String[] args) {
		MyQueue<Integer> myQueue = new MyQueue<Integer>();
		
		MyNode<Integer> firstNode = new MyNode<Integer>(70);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		MyNode<Integer> thirdNode = new MyNode<Integer>(56);
		
		myQueue.enqueue(firstNode);
		myQueue.enqueue(secondNode);
		myQueue.enqueue(thirdNode);
		
		System.out.println("The content of queue starting from rare end : ");
		myQueue.display();
		
		System.out.println("the size of the queue : "+myQueue.size());
		
		System.out.println("The dequeued element is : "+myQueue.dequeue().getKey());
		
		System.out.println("The content of queue starting from rare end: ");
		myQueue.display();
		
		
		System.out.println("is queue empty : "+ myQueue.isEmpty());
		
	}
}
