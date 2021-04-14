/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit04_HW;

import java.util.Scanner;

/**
 *
 * @author Linh
 */
public class Task04 {

    public static void main(String[] args) {
        String arr[][] = new String[8][8];
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr[i].length-1; j>i ; j--) {
                if (j >(arr.length-8-i)) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}
