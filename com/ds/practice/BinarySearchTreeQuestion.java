package com.ds.practice;

import java.util.HashSet;

import com.ds.tree.BinarySearchTree;
import com.ds.tree.TreeNode;

public class BinarySearchTreeQuestion {

	public static void main(String[] args) {
		
	}
	public static void run() {
		BinarySearchTree tree1 = new BinarySearchTree();
		tree1.add(tree1.root, tree1.createNode(10));
		tree1.add(tree1.root, tree1.createNode(12));
		tree1.add(tree1.root, tree1.createNode(11));
		scanTree(tree1.root, true);

	
		BinarySearchTree tree2 = new BinarySearchTree();
		tree2.add(tree2.root, tree2.createNode(10));
		tree2.add(tree2.root, tree2.createNode(12));
		tree2.add(tree2.root, tree2.createNode(15));
		scanTree(tree2.root, false);
		
		if (tree1.size != tree2.size) {
			System.out.println("Trees are not equal");
		}
		
	}
	static HashSet<Integer> set = new HashSet<Integer>();
	public static void scanTree(TreeNode node, boolean isSaved) {
		if(node == null) {
			return;
		}
		if (isSaved == true) {
			set.add(node.value);
		}else {
			if (!set.contains(node.value)){
				System.out.println("Trees are not equal");
			}
		}
		scanTree(node.left, isSaved);
		scanTree(node.right, isSaved);
	}
}