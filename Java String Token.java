import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        if (!scan.hasNext()){
            System.out.println(0);
            return;
        }
        String s = scan.nextLine();
        
        if ((s.length() > 0) || (s.length() < 400000)) {
            String[] tokens = s.trim().split("[\\s!,?._'@]+");
            System.out.println(tokens.length);
            for (String a : tokens)
            System.out.println(a);
        } 
            
        // Write your code here.
        scan.close();
        
    }
}

