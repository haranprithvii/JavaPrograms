package com.ds.tree;

public class BSTImpl {

	public static void main(String[] args) {
		BinarySearchTree bt = new BinarySearchTree();
		bt.add(bt.root, bt.createNode(10));
		bt.add(bt.root, bt.createNode(12));
		bt.add(bt.root, bt.createNode(11));
		bt.add(bt.root, bt.createNode(13));
		bt.add(bt.root, bt.createNode(6));
		
		bt.search(9, bt.root);
		}

}
