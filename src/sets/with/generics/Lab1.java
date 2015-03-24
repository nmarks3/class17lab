/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sets.with.generics;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nmarks3
 */
public class Lab1 {

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("Coding Java");
        list.add("Riding my bike");
        list.add("Driving to the bike store");
        list.add("Driving home from the bike store");

        for (Object s2 : list) {
            System.out.println((String) s2);
        }

        list.remove(1);

        for (Object s2 : list) {
            System.out.println((String) s2);
        }

        list.add(2, "Riding my motorcycle");

        for (Object s2 : list) {
            System.out.println((String) s2);
        }

    }
}
