/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit07;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Linh
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add("Son");
        al.add("Dat");
        al.add("Thanh Dat");
        al.add("An");
        System.out.println(al);
        al.add(0,"Hai");
        System.out.println(al);
        ArrayList al1 = new ArrayList();
        al1.add("Duc");
        al1.add("Vinh");
        System.out.println("Al1: "+al1);
        al.addAll(al1);
        System.out.println(al);
        al.addAll(3, al1);
        System.out.println(al);
        
//        al.clear();
//        System.out.println(al);

        System.out.println(al.contains("Duc"));
        System.out.println(al.get(5));
        System.out.println(al.indexOf("Dat"));
        System.out.println(al.isEmpty());
        System.out.println(al.lastIndexOf("Vinh"));
        
        al.remove("Duc");
        System.out.println(al);
        al.remove(4);
        System.out.println(al);
        al.set(0, "Binh");
        System.out.println(al);
        System.out.println(al.size());
        
        Collections.sort(al);
        System.out.println(al);
        
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }
        
        for (Object item:al) {
            System.out.println(item);
        }
    }
}
