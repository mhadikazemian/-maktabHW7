package com.maktab.HW7.Q2;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class TreeTest {
    public static void union (Set<Character> t1, Set<Character> t2){
        System.out.println("Union: ");
        Set<Character> union = new TreeSet<>();
        for (char a:t1) {
            union.add(a);
        }
        for (char a:t2) {
            union.add(a);
        }
        for (char a:union){
            System.out.println(a);
        }
        System.out.println("***************");
    }
    public static void shared(Set<Character> t1, Set <Character> t2){
        System.out.println("Shared: ");
        Set<Character> shared = new TreeSet<>();
        for (char a: t1) {
            for (char b: t2) {
                if (a == b)
                    shared.add(a);
            }
        }
        for (char a: shared) {
            System.out.println(a);
        }
        System.out.println("***************");
    }
    public static void main(String[] args) {

        Set<Character> tree = new TreeSet<>();
        Set<Character> tree2 = new TreeSet<>();
        
        Random random = new Random();
        
        for (int i = 0; i < 10 ; i++) {
            tree.add((char)(random.nextInt(26) + 'a'));
            tree2.add((char)(random.nextInt(26) + 'a'));
        }
        System.out.println("first tree: ");
        for (char a: tree) {
            System.out.println(a);
        }
        System.out.println("***************");
        System.out.println("second tree");
        for (char a: tree2) {
            System.out.println(a);
        }
        System.out.println("***************");
        TreeTest.union(tree , tree2);
        TreeTest.shared(tree, tree2);
    }
}
