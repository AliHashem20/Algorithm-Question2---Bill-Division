package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<Integer> bill= Arrays.asList(3, 10, 2, 9);
        bonAppetit(bill, 1, 12);
    }

    public static void bonAppetit(List<Integer> bill, int k, int b) {

        int sum = 0;

        for (int i = 0; i<bill.size(); i++) {
            if(i != k)
                sum += bill.get(i);
        }

        int cost = sum/2;
        if(cost == b)
            System.out.println("Bon Appetit");
        else
            System.out.println((b-cost) + "");
    }

}
