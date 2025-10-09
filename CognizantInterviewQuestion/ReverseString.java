package CognizantInterviewQuestion;

public class ReverseString {
    public static void main(String[] args) {
        String original = "Krishna";
        StringBuilder sb = new StringBuilder (original);
        String reversed  = sb.reverse().toString();
        System.out.println("Original String is :- "+original);
        System.out.println("Reversed String is:- "+ reversed);

    }
}
