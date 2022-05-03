package com.greatlearning.app;
import com.greatlearning.model.*;
import com.greatlearning.services.*;
import java.util.*;



public class Driver {

	public static void main(String[] args) {
		
		int n;		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the total no of floors in the building");
		n = sc.nextInt();
		ArrayList<Integer> inputArrli = new ArrayList<Integer>();
		inputArrli = Model.creatInputArray(n);
		Services.orderConstruction(inputArrli);
		sc.close();

	}


}