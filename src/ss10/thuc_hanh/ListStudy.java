package ss10.thuc_hanh;

import java.util.ArrayList;
import java.util.List;

public class ListStudy {
    public static void main(String[] args) {

        // vd ve mang
        String [] str = new String[3];
        str[0] = "vi tri 0";
        str[1] = "vi tri 1";
        str[2] = "vi tri 2";
        System.out.println(str[1]);

        // vd list
        List<String> listStr = new ArrayList<String>();
        listStr.add("add lan 1");
        listStr.add("add lan 2");
        listStr.add("add lan 3");

        System.out.println(listStr.get(1));

        listStr.set(1,"sua lan 4");
        System.out.println(listStr.get(1));

        if (1==1) {
            throw new IndexOutOfBoundsException("bij loi roi");
        }
        System.out.println("end");
    }
}
