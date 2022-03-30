package com.data;

public class LinkedList {
	Node head;
	static class Node
	{
		int data;
	    Node next;
	}

	public void insert(int data) {
		Node node = new Node();
		node.data = data;

		if (head == null) {
			head = node;
		} else {
			Node n = head;// temp node
			while (n.next != null) {
				n = n.next;
			}
			n.next = node;

		}
	}

	public void display() {
		Node node = head;
		while (node.next != null) {

			System.out.println(node.data);
			node = node.next;

		}
		System.out.println(node.data);
	}
	public void insertAtStart(int data)
	{
		Node node = new Node();
		node.data = data;
		node.next=head;
		head=node;
	}
	public void insertAt(int index,int data)
	{
		Node node = new Node();
		node.data = data;
		if(index==0)
		{
			insertAtStart(data);
		}
		Node n=head;
		for(int i=0;i<index-1;i++)
		{
			n = n.next;			
		}
		node.next=n.next;
		n.next=node;
	}
	public void deleteAt(int index)
	{ 
		Node n=head;
		Node n1=null;
		if(index==0)
		{
			head=head.next;
		}
		for(int i=0;i<index-1;i++)
		{
			n = n.next;			
		}
		n1=n.next;
		n.next=n1.next;	
	}
	public static void main(String[] args) {
		LinkedList liss = new LinkedList();
		liss.insert(23);
		liss.insert(45);
		liss.insert(11);
		liss.insertAtStart(9);
		liss.insertAt(2,3);
		liss.deleteAt(2);
		liss.display();
	}

}
