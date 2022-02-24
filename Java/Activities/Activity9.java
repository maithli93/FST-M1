package activities;

import java.util.ArrayList;
import java.util.List;

public class Activity9 {

	public static void main(String[] args) {
     List<String> myList=new ArrayList<String>();
      myList.add("Lisa");
      myList.add("Joy");
      myList.add("Tom");
      myList.add("Alis");
      
      System.out.println("Print all the names in the list");
      for(String names:myList)
      {
    	  System.out.println(names);
      }
      System.out.println("Third element in the list: "+myList.get(2));
      System.out.println("Is Tom in list: "+myList.contains("Tom"));
      myList.remove("Tom");
      System.out.println("New Size of an ArrayList: " +myList.size());


	}

}
