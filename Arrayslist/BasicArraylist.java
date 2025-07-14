package Arrayslist;
import java.util.*;
public class BasicArraylist {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<Integer>();
    // list.rempoiv
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);
        l1.add(50);
        System.out.println(l1);
        l1.add(1,100);
        l1.remove(0);
        System.out.println(l1);
    }
    
}
