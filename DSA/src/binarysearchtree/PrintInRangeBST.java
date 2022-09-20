package binarysearchtree;

public class PrintInRangeBST {

			public static class Node{
				int data;
				Node left;
				Node right;
				
				public Node(int data) {
					this.data = data;
				}
				
			}
			
			public static Node insert(Node root , int val) {
				if(root==null) {
					root = new Node(val);
					return root;
				}
				if(root.data>val) {
					root.left = insert(root.left, val);
					
				}else {
					root.right = insert(root.right, val);
					
				}
				return root;
				
			}
			public static void inorder(Node root) {
				if(root==null) {
					return;
				}
				inorder(root.left);
				System.out.print(root.data+ " ");
				inorder(root.right);
			}
			
			public static void Inrange(Node root , int x , int y) {
				if(root==null) {
					return;
				}
				if(root.data >=x && root.data<=y) {
					Inrange(root.left, x, y);
					System.out.print(root.data+" ");
					Inrange(root.right, x, y);
				}
				else if(root.data>=y) {
					Inrange(root.left, x, y);
				}
				else {
					Inrange(root.right, x, y);
				}
			}
			public static void main(String[] args) {
				
			
				int values[] = {8,5,3,1,4,6,10,11,14};
				Node root = null;
				for(int i=0;i<values.length;i++) {
					root = insert(root, values[i]);
				}
				inorder(root);
				System.out.println();
				
				Inrange(root, 1, 10);
			
				}
			}

