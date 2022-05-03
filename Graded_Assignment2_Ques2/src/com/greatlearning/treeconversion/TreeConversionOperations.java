package com.greatlearning.treeconversion;
import java.util.ArrayList;
import java.util.Collections;


public class TreeConversionOperations {
	
	
	    ArrayList<Integer> tempList = new ArrayList<Integer>();
		 static Node prevNode=null;
		 static Node tempNode=null;
		public static Node headNode=null;
		int size=0;
		
	//This method would traverse through the BST and capture all the nodes and push them to a arrayList so that they can be sorted.	
		public void flattenBSTToRightSkewed(Node root)
		{
			if(root==null)
				
				return;
			flattenBSTToRightSkewed(root.left);
			Node left = root.left;
			Node right = root.right;
			tempList.add(root.data);
			
			
			flattenBSTToRightSkewed(right);
			
		}
		
		 
     //Method to sort the tree nodes in Ascending order as per the requirement.
		public void sortElementsForCreatingSkewedTree()
		{
			Collections.sort(tempList);
			size=tempList.size();
			
		}
	//Method to create the new Right Skewed Tree with no left nodes and elements in ascending order		
		public void createSkewedTree()
		{
			for(int i=0;i<size;i++)
			{
				if(headNode==null)
				{
					headNode = new Node(tempList.get(i));
					headNode.left= null;
					prevNode= headNode;
					System.out.println(headNode.data);
					
				}
				else
				{
					tempNode= new Node(tempList.get(i));
					prevNode.right= tempNode;
					System.out.println(tempNode.data);
					prevNode= tempNode;
					
					
					
				}
			}
			
		}
		
		
	}