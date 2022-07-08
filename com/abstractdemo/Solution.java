package com.abstractdemo;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		MyLinkedList list = new MyLinkedList(null);
//		list.traverse(list.getRoot());
//		
		SearchTree tree = new SearchTree(null);
		tree.traverse(tree.getRoot());
		
		
	   String stringData = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";
	//	String stringData = "5 7 3 9 8 2 1 0  4 6";
		String[] data = stringData.split(" ");
		for(String s : data) {
			tree.addItem(new Node(s));
		}
		
		tree.traverse(tree.getRoot());
		tree.removeItem(new Node("Perth"));
		tree.traverse(tree.getRoot());
		
		
	}

}
