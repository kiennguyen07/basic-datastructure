/*
 * Copyright Orchestra Networks 2000-2008. All rights reserved.
 */
package com.kiennguyen07.training.ds;

/**
 */

final class Node
{
	private Object data;
	private Node next;
	
	public Object getData()
	{
		return this.data;
	}
	public void setData(Object data)
	{
		this.data = data;
	}
	public Node getNext()
	{
		return this.next;
	}
	public void setNext(Node next)
	{
		this.next = next;
	}
	
}

class LinkedList
{
	private Node header;
	public Node getHeader()
	{
		return header;
	}
	
	public void push(Node newNode){
		if(newNode == null) return;
		newNode.setNext(header);
		header = newNode;
	}
	
	public void insertAfter(Node afterNode, Node newNode){
		
	}
	public void append(Node newNode)
	{
		if(newNode == null) return;
		if (header == null)
		{
			header = newNode;
			return;
		}
		Node lastNode = header;
		while (lastNode != null)
		{
			if (lastNode.getNext() == null)
			{
				lastNode.setNext(newNode);
				break;
			}
			lastNode = lastNode.getNext();
		}
	}

	public void printList()
	{
		Node node = header;
		while (node != null)
		{
			System.out.println(node.getData());
			node = node.getNext();
		}
	}

}

public class SingleLinkedList
{
	public static void main(String[] args)
	{
		LinkedList linkedList = new LinkedList();
		for (int i = 0; i < 3; i++)
		{
			Node node = new Node();
			node.setData(i);
			linkedList.append(node);
		}
		linkedList.printList();
	}
}
