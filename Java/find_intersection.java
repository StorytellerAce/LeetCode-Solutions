package Java;
//Q1 – Given 2 array of string/number, find the intersection (if I remember correctly). 
//(Probably just use a set, they have given most the code snippet, should be easy)

import java.util.*;

public class find_intersection {
    public static void main(String[] args) {
        Integer[] arr1 = {1,2,3,4,5};
        Integer[] arr2 = {3,4,5,6,7};

        // Set<Integer> set1 = new HashSet<Integer>(Arrays.asList(arr1));
        // Set<Integer> set2 = new HashSet<Integer>(Arrays.asList(arr2));

        // set1.retainAll(set2);
        // //find intersection
        // System.out.println("Intersection: " + set1);

        //sol2
        List<Integer> list1 = Arrays.asList(arr1);
        List<Integer> list2 = Arrays.asList(arr2);
        List<Integer> intersection = new ArrayList<Integer>();
        for (Integer num1: list1){
            if (list2.contains(num1)){
                intersection.add(num1);
            }
        }
        System.out.println("Intersection: " + intersection);
    }

}
