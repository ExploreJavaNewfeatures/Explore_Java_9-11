package Java9;

import java.util.*;

public class Java9FactoryMethodOfCollections {
    public static List<Integer> addListJava9Before() {
        List<Integer> listJava9Before= new ArrayList<>(Arrays.asList(1,2,3,4));
        listJava9Before.add(5);
        return listJava9Before;
    }
    /*
    In java 9, they use "of" method to define an immutable collection for "list" "set" and "map" these mutable collection
    The elements in the collections cannot be null
    */
    public static List<Integer> addListJava9() {
        List<Integer> listJava9 =
                List.of(1, 2, 3, 4);
        try {
            listJava9.add(5);
        } catch (UnsupportedOperationException e){
            System.out.println("Add element failed: "+ e);
        }
     return listJava9;
    }

    public static void main(String[] args) {
        System.out.println(addListJava9Before().equals(addListJava9()));
    }
}
