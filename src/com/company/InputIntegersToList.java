package com.company;

import com.sun.xml.internal.fastinfoset.util.StringIntMap;

import javax.swing.*;
import java.util.*;
import java.util.LinkedList;

public class InputIntegersToList {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<Integer>();
        System.out.println("Enter numbers please, when it will be enough enter a char: ");


        while(scan.hasNextInt()){
            list.add(scan.nextInt());
        }

        Integer [] nums = list.toArray(new Integer[0]);
        for(int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }
        System.out.println("List of numbers: " +list);

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter one more num");

            list.addFirst(scanner.nextInt());


        System.out.println("List of numbers: " +list);

        Scanner scanner1=new Scanner(System.in);
        System.out.println("Enter one more num");

        list.addLast(scanner1.nextInt());


        System.out.println("List of numbers: " +list);
    }

}