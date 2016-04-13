package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class InputIntegersToList {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.println("Enter numbers please, when it will be enough enter a char: ");


        while(scan.hasNextInt()){
            list.add(scan.nextInt());
        }

        Integer [] nums = list.toArray(new Integer[0]);
        for(int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }

        System.out.println("List of numbers: " +list);
    }
}