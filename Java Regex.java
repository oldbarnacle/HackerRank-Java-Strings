import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class Solution{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}
/*
1--> it can contain single digit i.e ([0-9]);

2--> It can contain two digits i.e ([0-9][0-9]);

3--> Range is (099 to 199)i.e((0|1)[0-9][0-9]);

4--> range is (200 - 249) i.e (2[0-9][0-9]) ;

5--> range is (250-255) i.e (25[0-5]);
*/
//Write your code here
class MyRegex {
    String data = "([0-9]|[0-9][0-9]|(0|1)[0-9][0-9]|2[0-4][0-9]|25[0-5])"; 
    public String pattern = data + "." + data + "." + data + "." + data; 
}
