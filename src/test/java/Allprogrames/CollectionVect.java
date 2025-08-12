package Allprogrames;

import java.util.*;

public class CollectionVect {

	public static void main(String[] args) {
		
		Vector<Integer> vect = new Vector<>(Arrays.asList(20, 30, 45, 50));
	//	vect.add("Balu");
		int sum=0;
		for(int i=0; i<vect.size();i++) {
			sum+=(Integer)vect.get(i);
		}

	}

}
