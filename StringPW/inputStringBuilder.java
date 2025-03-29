package StringPW;
import java.util.*;
public class inputStringBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine()) ;
        System.out.println(sb);
        sb.setCharAt(1, 'a');
        System.out.println(sb);
    }
}
