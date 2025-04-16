    import java.util.*;
public class sorting {
    public static void main(String[] args) {
        String s = "krishna";
        char [] ch = s.toCharArray();
        for(char ele : ch){
            System.out.print(ele);

        }
        System.out.println();
        Arrays.sort(ch);
        for(char ele : ch){
            System.out.print(ele);
        }
        System.out.println();

    }
}
