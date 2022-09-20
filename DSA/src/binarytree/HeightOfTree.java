package binarytree;

public class HeightOfTree {
			
			static class Node{
				int data;
				Node left;
				Node right;
				
				public Node(int data) {
					this.data = data;
					this.left = null;
					this.right = null;
					
				}
			}
			
			static class BinaryTree{
				static int idx =-1;
				public static Node buildTree(int nodes[]) {
					idx++;
					if(nodes[idx] == -1) {
						return null;
					}
					Node newNode = new Node(nodes[idx]);
					newNode.left = buildTree(nodes);
					newNode.right = buildTree(nodes);
					return newNode;
				}
			}
		
			
			public static int Height(Node root) {
				if(root==null) {
					return 0;
				}
				int leftheight = Height(root.left);
				int rightheight = Height(root.right);
				int myheight = Math.max(leftheight, rightheight)+1;
				return myheight;
			}
			
			public static void main(String[] args) {
				int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
				BinaryTree tree = new BinaryTree();
				Node root = tree.buildTree(nodes);
			    System.out.println(Height(root));
			}

	}

