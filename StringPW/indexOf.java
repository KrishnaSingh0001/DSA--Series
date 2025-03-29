package StringPW;

public class indexOf {
    public static void main(String[] args) {
        // inexOf function 
        String s = "Krishna Singh";
        System.out.println(s.indexOf('K'));

        System.out.println();

        // compareTo function 

        String a = "abc";
        String b= "dbc";
        System.out.println(a.compareTo(b));

        // startwith() function and contains() function : - provide answer in true or false only if the words contains that letter then provide true otherwise false 

        // startWith() function

        String c = "Physics wallah";
        System.out.println(c.contains("alla"));

        System.out.println();

        // contain() fuction 
        System.out.println(c.startsWith("Phy"));
        System.out.println(s.startsWith("Singh"));


    }
    
}
