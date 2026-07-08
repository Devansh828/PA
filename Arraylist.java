
import java.util.ArrayList;
import java.util.Collections;

public class Arraylist{
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("ArrayList: " + list);
        System.out.println("Size of ArrayList: " + list.size());
        Collections.reverse(list);
        System.out.println("Reversed ArrayList: " + list);
        Collections.sort(list);
        System.out.println("Sorted ArrayList: " + list);
        System.out.println("Maximum element: " + Collections.max(list));
    }
}