package activities;

import java.util.HashMap;
import java.util.Map;

public class Activity11 {

	public static void main(String[] args) {
    
		Map<Integer,String> colours=new HashMap<Integer,String>();
		colours.put(1, "Black");
		colours.put(2, "Blue");
		colours.put(3, "Orange");
		colours.put(4, "Red");
		colours.put(5, "Grey");
		colours.put(6, "Pink");
		System.out.println("Size of the Map: "+colours);
       System.out.println("After removing Pink: "+colours.remove("Pink"));
      if(colours.containsValue("Green")) {
    	  System.out.println("Green exists in the Map");
      }
      else
      {
    	  System.out.println("Green does not exist in the Map");
      }
		System.out.println("Size of the Updated Map: "+colours.size());

        
	}

}
