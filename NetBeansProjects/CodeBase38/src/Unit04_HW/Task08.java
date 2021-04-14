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
public class Task08 {

    public static void main(String[] args) {
        int arr[][] = new int[9][9];
        int num = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j <= i) {
                    System.out.print(num + j);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}
