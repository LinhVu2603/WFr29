/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit02_HW;

/**
 *
 * @author Linh
 */
public class Task12 {

    public static void main(String[] args) {
        System.out.println("Cac ky tu tu 0 den 31 khong the in ra man hinh.");
        System.out.println("Ky tu thu 32 la Space.");
        int i = 0;
        while (i < 127) {
            System.out.println(i + " " + (char) i);
            i++;
        }
        System.out.println("-----------------");
        for (int j = 0; j < 127; j++) {
            System.out.println(j + " " + (char) j);
        }
        System.out.println("-----------------");
        int h = 0;
        for (; h < 127;) {
            System.out.println(h + " " + (char) h);
            h++;
        }
        System.out.println("-----------------");
        int k = 0;
        do {
            System.out.println(k + " " + (char) k);
            k++;
        } while (k < 127);
    }
}
