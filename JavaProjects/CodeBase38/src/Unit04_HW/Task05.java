/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit04_HW;

/**
 *
 * @author Linh
 */
public class Task05 {

    public static void main(String[] args) {
        String arr[][] = new String[6][6];
        for (int i = 0; i < arr.length; i++) {
            if ((i == 0) || (i == arr.length - 1)) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print("#");
                }
                System.out.print("\n");
            } else {
                for (int j = 0; j < arr[i].length; j++) {
                    if ((j == 0) || (j == arr[i].length - 1)) {
                        System.out.print("#");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.print("\n");
            }
        }
    }
}
