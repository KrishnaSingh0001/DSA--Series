package CognizantInterviewQuestion;

public class validAnagram {
    public static boolean validanagram(String s , String t) {
        // String s = " anagram";
        // String t = "nagaram";
        int m = s.length();
        int n = t.length();
        if( m!=n){
            return false;
        }
        else{
            int count[] = new int[26];
            for( int i = 0 ; i < m ; i++){
                count[s.charAt(i) - 'a']++;
            }
            for( int i = 0 ; i < n ; i++){
                count[s.charAt(i) - 'a']--;
            }

            for(int i = 0 ; i < count.length; i++){
                if(count[i] !=0){
                    return false;
    
                }
            }
            return true;
        }
    }
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(validanagram(s, t));
    }
}
