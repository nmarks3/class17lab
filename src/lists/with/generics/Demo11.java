/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lists.with.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Vector;

/**
 *
 * @author nmarks3
 */
public class Demo11 {
    public static void main(String[] args) {
        Set<String> list = new HashSet<>();
        list.add("5");
        list.add("Beer");
        list.add("Chips");
        list.add("Beef Sticks");
        list.add("Beer");
        
        List<String> list2 = new ArrayList<>(list);
        for(String a : list2) {
            System.out.println(a);
        }
    }
}
