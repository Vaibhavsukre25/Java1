package binarytree;

public class DiameterOfATree {
	
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
					
					// Approch 1 
					 
					public static int Diameter(Node root) {
						if(root==null) {
							return 0;
						}
						int dia1 = Diameter(root.left);
						int dia2 = Diameter(root.right);
						int dia3 = Height(root.left) + Height(root.right) +1;
						return Math.max(dia3, Math.max(dia1, dia2));
					}
					
					// Apporach 2
					
					static class TreeInfo{
						int ht;
						int diam;
						public TreeInfo(int ht , int diam) {
							this.ht = ht;
							this.diam = diam;
						}
					}
					public static TreeInfo Diameter2(Node root) {
						if(root==null) {
							return new TreeInfo(0,0); 
						}
						TreeInfo left = Diameter2(root.left);
						TreeInfo right = Diameter2(root.right);
						int myHeight = Math.max(left.ht, right.ht) + 1;
						int diam1 = left.diam;
						int diam2 = right.diam;
						int diam3 = left.ht+right.ht +1;
						int myDiam = Math.max(diam3, Math.max(diam1, diam2));
						
						TreeInfo myInfo = new TreeInfo(myHeight, myDiam);
						return myInfo;
						
					}
					
					public static void main(String[] args) {
						int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
						BinaryTree tree = new BinaryTree();
						Node root = tree.buildTree(nodes);
					   System.out.println(Diameter(root));
					   System.out.println(Diameter2(root).diam);
					}
}