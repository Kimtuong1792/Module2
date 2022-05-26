package ss15.bai_tap;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IllegalTriangleException {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        boolean flag;
        do {
            flag = false;

            //IllegalTriangleException triangleEdge = new IllegalTriangleException();
            try {
                System.out.println("Nhập cạnh thứ nhất của tam giác:  ");
                int x = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập cạnh thứ hai của tam giác: ");
                int y = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập cạnh thứ ba của tam giác: ");
                int z = Integer.parseInt(scanner.nextLine());
                check(x, y, z);
            }
            catch (MyException e) {
                e.printStackTrace();
                flag = true;

            } catch (NumberFormatException e1) {
                System.out.println("bị loi roi, hay nhap lại so tu dau ");
                flag = true;

            }
        } while (flag);
    }

    public static void check(int x, int y, int z) throws MyException {
        if (x <= 0 || y <= 0 || z <= 0) {
            throw new MyException("cạnh của tam giác phải lớn hơn 0 , vui lòng nhập lại");
        } else if (x + y < z || x + z < y || y + z < x) {
            throw new MyException(" không phải 3 cạnh của tam giác, vui lòng nhập lại");
        } else {
            System.out.println("3 số vừa nhập là cạnh của tam giác");
        }


    }
}
