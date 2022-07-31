package com.vikash.question1.driver;

import java.io.IOException;
import java.util.Scanner;

import com.vikash.question1.driver.*;

class Driver {

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);

		System.out.println("enter the total no of floors in the building");
		
		int noOfFloor = scan.nextInt();

	    int[] floors = new int[noOfFloor];
		
	   
		for(int i=0; i<noOfFloor; i++)  
		{  
		System.out.println("enter the floor size given on day : "+(i+1));
		floors[i] = scan.nextInt(); 
		}  
		System.out.println();
		
		Service service = new Service();
		service.printConstructionTable(floors, noOfFloor);
	}
}