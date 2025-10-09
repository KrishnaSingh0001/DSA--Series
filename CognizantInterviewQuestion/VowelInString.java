package CognizantInterviewQuestion;

public class VowelInString {
    public static void main(String[] args) {
        String s = new String();
        s = "Krishna";
        int vowel = 0;
        int constant = 0;
        s = s.toUpperCase();
        for(int i =0;i<s.length();i++){
            char c = s.charAt(i);
            if(c >= 'A' && c <= 'Z'){
                if(c=='A'|| c=='E'|| c=='I'|| c=='O'|| c=='U'){
                    vowel++;
                }
                else{
                    constant++;
                }
            }
        }
        System.out.println(vowel);
        System.out.println(constant);
    }
}
