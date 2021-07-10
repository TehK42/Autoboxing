package com.tehk42;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //Old method of wrapping
        Integer integer = new Integer(54);
        Double doubleValue = new Double(12.25);

        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
        //Autoboxing
        for(int i = 0; i <= 10; i++) {
            integerArrayList.add(Integer.valueOf(i));
        }
        //Unboxing
        for(int i = 0; i <= 10; i++) {
            System.out.println(i + " --> " + integerArrayList.get(i).intValue());
        }

        //New method of wrapping
        Integer myNewInt = 54; //Integer.valueOf(54);
        int myInt = myNewInt; //myNewInt.intValue();

        ArrayList<Double> myDoubleValue = new ArrayList<Double>();
        for(double dbl = 0.0; dbl <= 10.0; dbl += 0.5) {
            myDoubleValue.add(dbl);
        }
        for(int i = 0; i <= myDoubleValue.size(); i++) {
            double number = myDoubleValue.get(i);
            System.out.println(i + " --> " + number);
        }

     }
}
