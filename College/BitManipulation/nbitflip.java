package College.BitManipulation;

public class nbitflip {
    public static void main(String[] args) {
        int a = 10 ; int b = 7 ; 
        int x = a^b;
        int count =0;
        while(x>0){
            x = x&(x-1);
            count ++;
        }
        System.out.println(count);
    }
}
