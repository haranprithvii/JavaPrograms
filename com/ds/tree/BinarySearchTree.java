package com.ds.tree;

public class BinarySearchTree {
public TreeNode root;
	public BinarySearchTree() {
		root = null;
	}
	
	public TreeNode createNode(int value) {
		return new TreeNode(value, null, null);
	}
	public int size=0;
	public void add(TreeNode start, TreeNode newNode) {
		if (root == null) {
			root = newNode;
			return;
		}
		if (newNode.value > start.value) {
			if (start.right == null) {
				start.right = newNode;
				size++;
			}
			add(start.right, newNode);	
			
		}
		if (newNode.value < start.value) {
			if (start.left == null) {
				start.left = newNode;
				size++;
			}
			add(start.left, newNode);	
		}
	}
	
	public void search(int value, TreeNode start) {
		
		if (start == null) {
			System.out.println("node is not found");
			return;
		}
		if (value == start.value) {
			System.out.println("node is found");
			return;
		}
		
		if (value > start.value) {
			search(value, start.right);
		}
		if (value < start.value) {
			search(value, start.left);
		}
	}
		
}
