package com.greatlearning.services;

import java.util.ArrayList;

import java.util.Stack;

public class Services {
		
	public static void orderConstruction (ArrayList<Integer> inputArrLi) {
		
		int requireFloorSize = inputArrLi.size();
		ArrayList<Integer> tempArrLi = new ArrayList<Integer>();
		Stack<Integer> stack = new Stack<Integer>();
		
		// Traversing the Expression 
		
				for (int i = 0; i < inputArrLi.size(); i++) {
						
					System.out.println("Day: " + (i+1));
					int element = inputArrLi.get(i);
					boolean b = false;
			
					if (requireFloorSize == element && i != inputArrLi.size() -1 ) {	
												
						stack.push(element);					    						
					    if (stack.size()==1) {
					    	if (stack.peek() == requireFloorSize) {
					    		tempArrLi.add(stack.pop());
					    		requireFloorSize--;
					    	}else {
					    		
					    		element = stack.pop();	
						    	if(element == requireFloorSize-1) {
						    		tempArrLi.add(element);						    		
						    		requireFloorSize--;
						    		
						    	}	
					    	}
					    	
					    }else {
					    	stack = sortstack(stack);
					    	
					    	if ( i == inputArrLi.size() -1) {
					    		printStack(stack);
					    		
					    	}
					    	int top = stack.peek();
					    		while(top == requireFloorSize ) {
						    		
						    		tempArrLi.add(stack.pop());
						    		requireFloorSize--;
						    		if(!stack.isEmpty())
						    				top = stack.peek();
						    	}
					    							    						    	
					    	element = top;
					    	
					    }
					    System.out.println(tempArrLi);
					    tempArrLi.clear() ;
					    b = true; 
					}
					
					if (requireFloorSize == element && i == inputArrLi.size() -1 ) {
						stack.push(inputArrLi.get(i));
						
						while(!stack.isEmpty()) {
							tempArrLi.add(stack.pop());
						}
						System.out.println(tempArrLi);
						b = true;
					}
					
					if (element < requireFloorSize && b == false ) {
						stack.push(inputArrLi.get(i));						
						System.out.println(" ");
						
					}
		

				}	
						
	}

	private static void printStack(Stack<Integer> stack) {
		
		ArrayList<Integer> tempArrLi = new ArrayList<Integer>();
		for (int j = 0; stack.isEmpty() == false; j++) {
			
			tempArrLi.add(stack.pop());						
									
		}
		System.out.println(tempArrLi);
	}
	

	public static Stack<Integer> sortstack(Stack<Integer> input ){

		Stack<Integer> tmpStack = new Stack<Integer>();
		while(!input.isEmpty())
		{
		// pop out the first element
		int tmp = input.pop();

		// while temporary stack is not empty and
		// top of stack is greater than temp
		while(!tmpStack.isEmpty() && tmpStack.peek()
		    > tmp)
		{
		// pop from temporary stack and
		// push it to the input stack
		input.push(tmpStack.pop());
		}
	
		// push temp in temporary of stack
		tmpStack.push(tmp);
		}
	
		return tmpStack;
		}


	
	
	
}