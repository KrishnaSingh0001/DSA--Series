package StringPW;

public class maxValue {
    public static void main(String[] args) {
        String [] arr = {"1234", "-13456", "98765"};
        int mx = Integer.parseInt(arr[0]);
        for(int i = 1 ; i < arr.length; i++){
            int n = Integer.parseInt(arr[i]);
            mx = Math.max(mx , n);
        }
        System.out.println(mx);
    }
    
}
