package com.bridgelabz.stackandqueue;

import com.bridgelabz.linkedlist.MyNode;

public class StackAndQueueMain {
	public static void main(String[] args) {
		MyStack<Integer> myStack = new MyStack<Integer>();
		
		MyNode<Integer> firstNode = new MyNode<Integer>(70);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		MyNode<Integer> thirdNode = new MyNode<Integer>(56);
		
		myStack.push(firstNode);
		myStack.push(secondNode);
		myStack.push(thirdNode);
		
		System.out.println("The content of stack starting from top : ");
		myStack.display();
		
		System.out.println("the size of the stack : "+myStack.size());
		
		System.out.println("The popped element is : "+myStack.pop().getKey());
		
		System.out.println("The content of stack starting from top : ");
		myStack.display();
		
		System.out.println("the element at top :"+ myStack.peek().getKey());
		
		System.out.println("is stack empty : "+ myStack.isEmpty());
		
	}
}
