package com.greatlearning.model;
import java.util.*;

public class Model {

	public  static ArrayList<Integer> creatInputArray(int n) {
		
		ArrayList<Integer> arrliInput = new ArrayList<Integer>(n);
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i <= n; i++) {
			System.out.println("enter the floor size given on day : " + i);
			arrliInput.add(sc.nextInt());			
		}
		sc.close();
		System.out.println("-----------------------------------------------------------------------");
		//System.out.print("User Input day wise floor size for total "+ n +" no. floors building is : ");			
		//System.out.println(arrliInput);
		System.out.println("The order of construction is as follows ");
		System.out.println("-----------------------------------------------------------------------");
		return arrliInput;
	}
}