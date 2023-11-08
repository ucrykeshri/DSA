package String;

import java.util.*;

public class Main {
    public static void main(String args[]) {

    }


    public static String[] helper(String strArr) {

        String ans[] = new String[2];
        String str[] = strArr.split(",");
        String str1[] = str[1].split(",");
        String working_string = str[0];
        Set<String> set = new HashSet<>();
        for(int i=1;i<str1.length;i++) {
            set.add(str1[i]);
        }
        for(int i=0;i<working_string.length();i++) {
            String temp = working_string.substring(0,i);
            String temp1= working_string.substring(i);

            if(set.contains(temp) && set.contains(temp1)) {
                ans[0] = temp;
                ans[1] = temp1;
                break;
            }
        }
        return ans;
    }

}
