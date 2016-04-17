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

            list.addLast(scanner.nextInt());


        System.out.println("List of numbers: " +list);

        Scanner scanner1=new Scanner(System.in);
        System.out.println("Enter one more num");

        list.addLast(scanner1.nextInt());

        System.out.println("List of numbers: " +list);

        Scanner scanner2=new Scanner(System.in);
        System.out.println("Enter a number that you want add to a stack");
        list.push(scanner2.nextInt());
        System.out.println("List of numbers: " +list);

        System.out.println("Adding '0' to a queue");
        list.add(2,0);
        System.out.println("List: " +list);


    }

}