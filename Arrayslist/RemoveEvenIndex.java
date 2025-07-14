package Arrayslist;
import java.util.ArrayList;
import java.util.*;
import java.util.Arrays;
import java.util.List;

public class RemoveEvenIndex {

    public static void main(String[] args) {
        Integer[] l = {5, 4, 3, 6, 8, 13, 0};
        List<Integer> list = new ArrayList<>(Arrays.asList(l));

        for (int i = list.size() - 1; i >= 0; i--) {
            if (i % 2 == 0) {
                list.remove(i);
            }
        }

        System.out.println(list); 
    }
}