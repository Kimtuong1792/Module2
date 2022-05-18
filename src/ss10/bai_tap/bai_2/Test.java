package ss10.bai_tap.bai_2;

public class Test {
    public static void main(String[] args) {
        MyLinkedList<Integer> test = new MyLinkedList(78);
        test.add(1, 12);
        test.addFirst(11);
        test.addLast(88);
        test.printList();
        System.out.println("--------------------");
        test.remove(2);
        test.printList();
    }
}
