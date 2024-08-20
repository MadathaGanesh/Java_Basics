package Sorting_Dates;

    // Help Saransh in writing a java program to sort objects in array list by dates.

import java.util.ArrayList;
import java.util.Collections;

public class DriverClass {
    public static void main(String[] args) {
        ArrayList<DateItem> datelist = new ArrayList<>();
        datelist.add(new DateItem("2022-5-12"));
        datelist.add(new DateItem("2019-7-14"));
        datelist.add(new DateItem("200-12-4"));
        datelist.add(new DateItem("1992-12-10"));
        datelist.add(new DateItem("1220-11-28"));
        System.out.println("Dates in given order ::");
        for (DateItem i:datelist) {
            System.out.println(i.date);
        }
        System.out.println();
        Collections.sort(datelist,new sortItems());
        System.out.println("Sorted in ascending order :: ");
        for (DateItem d:datelist) {
            System.out.println(d.date);
        }
    }
}
