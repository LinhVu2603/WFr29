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
public class Task03 {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 2; j < 10; j++) {
                int s = 0;
                s = i * j;
                System.out.print(j + "x" + i + "=" + s + "\t");
            }
            System.out.println("\n");
        }
    }
}
