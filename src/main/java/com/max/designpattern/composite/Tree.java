package com.max.designpattern.composite;
/**
 * <p>
 * <b>DESIGN PATTERN 11: Composite pattern</b> <br>
 * whole-part relationships
 * </p>
 *  
 * @author 23885_000
 *
 */
public class Tree {
	TreeNode root = null;

	public Tree(String name) {
		root = new TreeNode(name);
	}

	public static void main(String[] args) {
		Tree tree = new Tree("A");
		TreeNode nodeB = new TreeNode("B");
		TreeNode nodeC = new TreeNode("C");

		nodeB.add(nodeC);
		tree.root.add(nodeB);
		System.out.println("build the tree finished!");
	}
}
