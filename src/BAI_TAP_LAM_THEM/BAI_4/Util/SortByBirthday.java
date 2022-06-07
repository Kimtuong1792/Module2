package BAI_TAP_LAM_THEM.BAI_4.Util;

import BAI_TAP_LAM_THEM.BAI_4.Model.Person1;

import java.util.Comparator;

public class SortByBirthday implements Comparator<Person1> {
    @Override
    public int compare(Person1 o1, Person1 o2) {
        if (o1.getBirthday().compareTo(o2.getBirthday()) < 0) {
            return 1;

        } else if (o1.getBirthday().compareTo(o2.getBirthday()) > 0) {
            return -1;
        } else {
            if (o1.getName().compareTo(o2.getName()) > 0) {
                return 1;
            } else if (o1.getName().compareTo(o2.getName()) < 0) {
                return -1;

            }else {
                return 0;
            }
        }
    }
}
