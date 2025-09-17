package IntegerTypeCode;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class Ascending_SortingOrder {

    public static void main(String[] args) {
        int[] input = {10, 30, 45, 55, 10, 3};
        
        Set<Integer> li = new TreeSet<>(Collections.reverseOrder()); //Collections.reverseOrder() for reverse order
        for(int con:input)
        li.add(con);

        for(int arr:li){
            System.out.print(" "+arr);
        }

    }

}


