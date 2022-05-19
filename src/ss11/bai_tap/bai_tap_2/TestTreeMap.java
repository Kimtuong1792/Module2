package ss11.bai_tap.bai_tap_2;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class TestTreeMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input your string");
        String str = scanner.nextLine();
        Map< String , Integer> map = new TreeMap<>();
        String[] word = str.toLowerCase().split(" ");
        int value = 1;
        for (String s : word) {
            if (!map.containsKey(s)) {

                map.put(s, value);
            } else {
                map.replace(s, (value + 1));
            }

        }
        System.out.println(map);
    }

}
