package Bai_tap_them.bai_3.util;

import Bai_tap_them.bai_3.Model.Staff;

import java.util.Comparator;

public class ComparatorSalary implements Comparator<Staff> {

    @Override
    public int compare(Staff o1, Staff o2) {
      if(o1.employmentSalary() > o2.employmentSalary()){
          return 1;
      }else if(o1.employmentSalary()<o2.employmentSalary()){
          return -1;
      }else {
          if (o1.getName().compareTo(o2.getName()) <0) {
              return -1;
          } else if (o1.getName().compareTo(o2.getName()) > 0) {
              return 1;
          } else {
              return 0;
          }
      }
    }
}
