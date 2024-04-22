//Task 1: List interface
 
//Implement a method that takes a List as an argument and removes every second element from the list, then prints the resulting list.

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class RemoveEverySecondElement {
    public static void removeEverySecond(List<Integer> list) {
        Iterator<Integer> iterator = list.iterator();
        boolean removeNext = false;
        while (iterator.hasNext()) {
            iterator.next(); 
            if (removeNext) {
                iterator.remove(); 
            }
            removeNext = !removeNext; 
        }
    }

    public static void main(String[] args) {
        
        List<Integer> myList = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            myList.add(i);
        }
        System.out.println("Original List: " + myList);
        removeEverySecond(myList);
        System.out.println("List after removing every second element: " + myList);
    }
}

