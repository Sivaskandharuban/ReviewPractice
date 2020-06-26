import java.util.*;

public class ListImpl {
	
	public static void main(String[] args) {
		

	ArrayList<Integer> aList = new ArrayList<Integer>();
	
	aList.add(20);
	aList.add(10);
	aList.add(100);
	
	System.out.println("Insertion Order");
	System.out.println(aList);
	
	
	Collections.sort(aList);
	System.out.println("After Ascending order");
	System.out.println(aList);
	
	Collections.reverse(aList);
	System.out.println("After Descending order");
	System.out.println(aList);
	
	for(Integer a : aList)
		System.out.println(a);
	
	for(int i =aList.size()-1; i>=0; i--) {
	
	System.out.println(aList.get(i));
	}
	
	
	}
	
	
}
