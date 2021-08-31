package com.bridgelabz.linkedlist;

public class MyNode<K> {
	private K key;
	private MyNode<K> next;
	
	public MyNode(K key){
		this.key = key;
		this.next =null;
	}
	
	public void setKey(K key) {
		this.key = key;
	}
	public K getKey() {
		return this.key;
	}
	
	public void setNext(MyNode<K> nextNode) {
		this.next = nextNode;
	}
	public MyNode<K> getNext(){
		return this.next;
	}
	
	
}
