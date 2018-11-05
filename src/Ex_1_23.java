/**
 * 
 */

/**
 * @author Xabier
	 *	Copy and paste this code into an Eclipse project and try to understand what each line of the code do. Comment all the lines.
		PD: You can add System.out.println-s to the code to help to understand it.
	 	***********************************************************************************
	 	*
	 	*	Summary:
	 	*
	 	*	ListIterator: It is like a cursor it is positioned between two "cells" of the ArrayList
	 	*
	 	* - We add 5 elements to aArrayList of Strings
	 	* - Print the next token until there is no next (the last one will be position 4 "element_5"
	 	* - Print the previous token until there is no next (the last one will be position 0 "element_1"
	 	* - In this position print the next and previous index (0,-1) and the next token "element_1" that is in index position 0
	 	* - Now that we are in the next position print previous and next index (0,1) and next token in position 1 "element_2".
	 	* - As the last point we have put the iterator was index 1 we will add a new string "element_6" in this position
	 	* - Print all the values in the ArrayList in ascendent order
	 	* - Print the next element index position 2 ("element_2")
	 	* - Remove the element stored in the last position pointed by iterator ("element_2"). After removing it the values will go to the left so the new value in index 2 is "element_3"
	 	* - Print all the values in the ArrayList in ascendent order
	 	* - Print the next element index position 2 ("element_3")
	 	* - Set the "element_7" string value in the last index position that has been pointing the iterator
	 	* - Print all the values in the ArrayList in ascendent order
 */
//Import the classes we are going to use ArrayList
import java.util.ArrayList;
//Import the classes we are going to use ListIterator
import java.util.ListIterator;
 
public class Ex_1_23 {
 
  public static void main(String[] args) {
	//Initialize a ArrayList of Strings
    ArrayList<String> arrayList = new ArrayList<String>();
    //Add the string "element_1"
    arrayList.add("element_1");
    //Add the string "element_2"
    arrayList.add("element_2");
    //Add the string "element_3"
    arrayList.add("element_3");
    //Add the string "element_4"
    arrayList.add("element_4");
    //Add the string "element_5"
    arrayList.add("element_5");
    //Initialize the ListIterator Object to our arrayList
    ListIterator it = arrayList.listIterator();
    //While the ListIterator has a token...
    while(it.hasNext())
    	// ...print the next token
         System.out.println(it.next());
    //While the ListIterator has a token before...
    while(it.hasPrevious())
    	 //...print the previous token
         System.out.println(it.previous());
    //Print the index of the previous token
    System.out.println("Previous Index is : " + it.previousIndex());
    //Print the index of the next token
    System.out.println("Next Index is : " + it.nextIndex());
    //Print the next token
    System.out.println("Next element is : " + it.next());
    //Print the index of the next token
    System.out.println("Previous Index is : " + it.previousIndex());
    //Print the index of the next token
    System.out.println("Next Index is : " + it.nextIndex());
    //Add the string "element_6"
    it.add("element_6");
    //Start a loop that goes position by position on the array list
    for(int i = 0; i < arrayList.size(); i++) 
    	  //Print the value stored in the actual position
          System.out.println(arrayList.get(i));
    //Print the next token
    System.out.println("Next element is : " + it.next());
    //Remove the the last token taken by next or previous
    it.remove();
    //Start a loop that goes position by position on the array list
    for(int i = 0; i < arrayList.size(); i++)
    	 	//Print the value stored in the actual position
            System.out.println(arrayList.get(i));
    //Print the next token
    System.out.println("Next element is : " + it.next());
    //In the last position the list has been rewrite the data by "element_7" 
    it.set("element_7");
  //Start a loop that goes position by position on the array list
    for(int i = 0; i < arrayList.size(); i++)
    		//Print the value stored in the actual position
           System.out.println(arrayList.get(i)); 

  }
}