import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        //Convert string to a char array and lowercase.
        char firstinput[] = a.toLowerCase().toCharArray();
        char secondinput[] = b.toLowerCase().toCharArray();
        if(a.length() != b.length()){
            return false;
        }
        else{
            java.util.Arrays.sort(firstinput);
            java.util.Arrays.sort(secondinput);
            return java.util.Arrays.equals(firstinput,secondinput);
        }
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
