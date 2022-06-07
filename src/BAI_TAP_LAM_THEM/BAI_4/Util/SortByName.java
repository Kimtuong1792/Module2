package BAI_TAP_LAM_THEM.BAI_4.Util;

import BAI_TAP_LAM_THEM.BAI_4.Model.Person1;
import BAI_TAP_LAM_THEM.BAI_4.Servies.PersonIMPL;

import java.util.Comparator;

public class SortByName implements Comparator <Person1> {

    @Override
    public int compare(Person1 o1, Person1 o2) {
        if(o1.getName().compareTo(o2.getName())>0){
            return 1;
        }else if(o1.getName().compareTo(o2.getName())<0){
            return -1;
        }else {
            return 0;
        }
    }
}
