package ss11.bai_tap.bai_tap_6;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        List<Demerging> person = new ArrayList<>();
        person.add(new Demerging("Thị Dậu", false, 2000));
        person.add(new Demerging("Chí Phèo", true, 1998));
        person.add(new Demerging("Thị Nở ", false, 1990));
        person.add(new Demerging("Văn Vàng", true, 1995));

        Queue<Demerging> queueGirl = new LinkedList<>();
        Queue<Demerging> queueBoy = new LinkedList<>();

        Collections.sort(person);
        for (Demerging iem : person) {
            System.out.println(iem);
        }
        for (Demerging demerging : person) {
            if (!demerging.isGender()) {
                queueGirl.add(demerging);
            } else {
                queueBoy.add(demerging);
            }
        }
        System.out.println("------------------");
        while (!queueGirl.isEmpty()) {
            System.out.println(queueGirl.poll());
        }
        while (!queueBoy.isEmpty()) {
            System.out.println(queueBoy.poll());
        }

    }
}
