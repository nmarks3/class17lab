/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sets.with.generics;

import common.Dog;
import common.Employee;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nmarks3
 */
public class Lab3 {
    public static void main(String[] args) {
        Employee e1 = new Employee("Smith", "John", "333-33-3333");
        Employee e2 = new Employee("Smith", "John", "333-33-3333");
        Employee e3 = new Employee("Jones", "Quincy", "444-44-4444");
        Dog d1 = new Dog("Cujo", 007);

        List list = new ArrayList();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(d1);
        
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i).toString();
            System.out.println(s);
        }
    
}}
