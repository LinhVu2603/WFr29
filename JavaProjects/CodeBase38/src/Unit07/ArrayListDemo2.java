/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit07;

import java.util.ArrayList;

/**
 *
 * @author Linh
 */
public class ArrayListDemo2 {

    public static void main(String[] args) {
        ArrayList<SinhVien> listSV = new ArrayList();
        SinhVien sv = new SinhVien("Linh", 21, "Zent");
        listSV.add(sv);
        System.out.println(listSV);
    }
}
