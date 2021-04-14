/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit02;

/**
 *
 * @author Linh
 */
public class Ex07 {

    public static void main(String[] args) {
        float s = 0;
        for (int i = 1; i <= 100; i++) {
            s = s + (float)1 / i;
        }
        System.out.println("Tong cua day so la " + s);
    }
}
