package AutoBoxingAndUnboxing;

import java.util.ArrayList;

public class DriverClass {
    public static void main(String[] args) {
        ArrayList<Integer> intarraylist=new ArrayList<Integer>();
        ArrayList<Double> doubleArrayList=new ArrayList<Double>();
        for (int j=0;j<10;j++){
            intarraylist.add(Integer.valueOf(j));
        }

        for (int i=0;i<10;i++) {
            System.out.println( i + " value is :: "+ intarraylist.get(i));
        }


        for (double d=0.0;d<10.0;d+=0.5){
            doubleArrayList.add(Double.valueOf(d));
        }

        for (int d=0;d<doubleArrayList.size();d++){
            System.out.println(d + " value is :: " + doubleArrayList.get(d));
        }
    }


}
