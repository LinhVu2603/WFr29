/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit02_HW;

import java.util.Scanner;

/**
 *
 * @author Linh
 */
public class Task07 {

    public static void main(String[] args) {
        int s = 0;
        for (int i = 1; i <= 100; i++) {
            if ((i % 3 == 0) || (i % 7 == 0)) {
                s = s + i;
            }
        }
            System.out.println("Sum is " + s);
    }
}
