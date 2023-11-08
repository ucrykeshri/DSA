package Arrays;

import java.util.*;

public class Solution {
    // DO NOT MODIFY THE LIST
    public static int repeatedNumber(final List<Integer> a) {
        Map<Integer , Integer> map = new HashMap<>();
        for(int i : a) {
            map.put(i, map.getOrDefault(i,0) + 1);
        }
        for (int i : map.keySet()) {
            if (map.get(i) > (a.size() / 3)) {
                return i; // Return the element itself, not its count
            }
        }
        return -1; // Return -1 if no element is found that satisfies the condition
    }
    public static  void main(String args[]){
        List<Integer>list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        System.out.println(repeatedNumber(list));
    }
}
