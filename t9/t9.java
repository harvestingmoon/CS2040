import java.util.*;
import java.util.HashMap;

public class t9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Character, String> map = new HashMap<>();
        map.put('a', "2");
        map.put('b', "22");
        map.put('c', "222");
        map.put('d', "3");
        map.put('e', "33");
        map.put('f', "333");
        map.put('g', "4");
        map.put('h', "44");
        map.put('i', "444");
        map.put('j', "5");
        map.put('k', "55");
        map.put('l', "555");
        map.put('m', "6");
        map.put('n', "66");
        map.put('o', "666");
        map.put('p', "7");
        map.put('q', "77");
        map.put('r', "777");
        map.put('s', "7777");
        map.put('t', "8");
        map.put('u', "88");
        map.put('v', "888");
        map.put('w', "9");
        map.put('x', "99");
        map.put('y', "999");
        map.put('z', "9999");
        map.put(' ', "0");

        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i ++) {
            String res = "";
            int c = i+1;
            String s = sc.nextLine();
            for (int j = 0; j < s.length(); j++) {
                if (!res.isEmpty() && res.charAt(res.length() -1) == map.get(s.charAt(j)).charAt(0)) {
                    res += " ";
                }

                res += map.get(res.charAt(j));
            }
            System.out.println("Case #" + c + ": " + res);
        }
        sc.close();


    }
    
}
