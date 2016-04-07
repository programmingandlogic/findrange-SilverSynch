/*
 * File: FindRange.java
 * --------------------
 * This program is a stub for the FindRange problem, which finds the
 * smallest and largest values in a list of integers.
 */

// We'll work with ArrayLists, since we need to deal with possibly infinite
// inputs from the user.
import java.util.ArrayList;
import java.util.Collections;

import acm.program.*;

public class FindRange extends ConsoleProgram
{
	
	// We create the ArrayList. Since ArrayLists can only handle objects,
	// we'll use Integer, an object wrapper for Int.
	ArrayList<Integer> numberList = new ArrayList<Integer>();
	
	public void run()
	{
		
		// This infinite loop handles user input. Since it pauses for each
		// input, and has a consistent exit condition, it's considered safe.
		while(true)
		{
			
			// We grab an int from the user, and only an int.
			Integer number = readInt("Input Number:");
			
			// If it's not our terminator, we add it to the list.
			if (number != 0)
			{
				numberList.add(number);
			}
			
			// Otherwise, we exit the loop.
			else
			{
				break;
			}
			
		}
		
		// Now that the loop has ended, we can start working on the data
		// we have. First we check that the list is NOT empty.
		if ( !(numberList.isEmpty()) )
		{
			
			// We use another java.util class, collections, to sort our
			// list for us.
			Collections.sort(numberList);
			
			// We then print the smallest and largest number, as
			// by specification.
			println("Smallest:" + numberList.get(0));
			println("Largest:" + numberList.get(numberList.size() - 1));
			
		}
		
		// If we have nothing in the list, the terminator was entered too
		// early and we need to abort.
		else
		{
			println("No non-terminator numbers were entered.");
		}
		
	}

}
