/******************************************
*
*	Sorting Algorithms - Driver 
*	@author  Alexandra Bush
*	
*	
*
*
*
*
*******************************************/

import java.util.*;

public class driver{

	public static void main(String [] args){
		
		if(args.length != 2){
			System.out.println("Error: usage. Run via command line: java driver [sortingtype] [filename]");
			System.exit(-1);
		}

		String sortingType = args[0];
		String filename = args[1];

		sortFile(sortingType, filename);
	}
	public static void sortFile(String type, String file){
		if     (type.equals("insertion")) System.out.println("insertion");
		else if(type.equals("selection")) System.out.println("selection");
		else if(type.equals("bubble"))	  System.out.println("bubble");
		else if(type.equals("shell"))	  System.out.println("shell");
		else if(type.equals("merge"))	  System.out.println("merge");
		else if(type.equals("heap"))      System.out.println("heap");
		else if(type.equals("quick"))     System.out.println("quick");
		else							  System.out.println("Error, not a valid sorting algorithm.");
	}
}
