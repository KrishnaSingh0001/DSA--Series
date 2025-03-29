package StringPW;

public class subString {
    public static void main(String[] args) {
        String s = "abcd";
        System.out.println(s.substring(3));
        //s.substring(3) : - 3 ya uske aage wale indecies


        System.out.println(s.substring(1,4));  
        // s.substring(1,4) : - print (i to j-1 )

        System.out.println(s.substring(2,2));
        System.out.println(s.substring(2, 3));

        // print all substring 

        for(int i = 0; i<s.length(); i++){
            for(int j=i+1 ; j<=s.length();j++){

                System.out.print(s.substring(i, j) + " ");
            }
            System.out.println();

        }
        // System.out.println();

    }
    
}
