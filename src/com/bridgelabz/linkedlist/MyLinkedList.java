package com.bridgelabz.linkedlist;

public class MyLinkedList<K> {
	public MyNode<K> head;
	public MyNode<K> tail;
	
	public MyLinkedList() {
		this.head = null;
		this.tail = null;
	}
	
	public void add(MyNode<K> newNode) {
		if(head == null) {
			this.head = newNode;
		}
		if(tail == null) {
			this.tail = newNode;
		}
		else {
			newNode.setNext(this.head);
			this.head = newNode;
		}
	}
	
	public void append(MyNode<K> newNode) {
		if(head == null) {
			this.head = newNode;
		}
		if(tail == null) {
			this.tail = newNode;
		}
		else {
			this.tail.setNext(newNode);
			this.tail = newNode;
		}
	}
	
	public void insert(MyNode<K> prevNode , MyNode<K> newNode) {
		MyNode<K> tempNode = prevNode.getNext();
		prevNode.setNext(newNode);
		newNode.setNext(tempNode);
	}
	
	public MyNode<K> pop(){
		MyNode<K> tempNode = this.head;
		this.head = this.head.getNext();
		return tempNode;
	}
	
	public MyNode<K> popLast(){
		MyNode<K> tempNode= this.head;
		while(!tempNode.getNext().equals(this.tail)) {
			tempNode = tempNode.getNext();
		}
		this.tail = tempNode;
		tempNode = tempNode.getNext();
		this.tail.setNext(null);
		return tempNode;
	}
	
	public MyNode<K> search(K key) {
		MyNode<K> tempNode = this.head;
		while(tempNode != null) {
			if(tempNode.getKey() == key) {
				return tempNode;
			}
			tempNode = tempNode.getNext();
		}
		return null;
	}
	
	public void searchAndInsert(K key, K value) {
		MyNode<K> tempNode = search(key);
		MyNode<K> newNode = new MyNode<K>(value);
		insert(tempNode, newNode);
	}
	
	public MyNode<K> delete(K key){
		MyNode<K> tempNode = this.head;
		while(tempNode != null) {
			if(tempNode.getNext().getKey() == key) {
				MyNode<K> deletedNode = tempNode.getNext();
				tempNode.setNext(deletedNode.getNext());
				return deletedNode;
			}
			tempNode = tempNode.getNext();
		}
		return null;
	}
	
	public int size() {
		int count = 0;
		MyNode<K> tempNode = this.head;
		while(tempNode != null) {
			count++;
			tempNode = tempNode.getNext();
		}
		return count;
	}
	
	public void display() {
		MyNode<K> tempNode = this.head;
		while(tempNode.getNext() != null) {
			System.out.print(tempNode.getKey()+" -> ");
			tempNode = tempNode.getNext();
		}
		System.out.println(tempNode.getKey());
	}
}
