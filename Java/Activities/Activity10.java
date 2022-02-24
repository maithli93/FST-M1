package activities;

import java.util.HashSet;
import java.util.Set;

public class Activity10 {

	public static void main(String[] args) {
    Set<String> hs=new HashSet<String>();
    hs.add("A");
    hs.add("B");
    hs.add("C");
    hs.add("D");
    hs.add("E");
    hs.add("F");
    
    System.out.println("Size of the HashSet: "+hs.size());
    System.out.println("Element present in the Set: "+hs);
    System.out.println("Remove element present in the Set: "+hs.remove("B"));
    System.out.println("Remove element not present in the Set: "+hs.remove("W"));
    System.out.println("Check if E is in the Set: "+hs.remove("E"));
    System.out.println("Element present in the Updated Set: "+hs);

	}

}
