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
public class Task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input n:");
        int n = sc.nextInt();
        float s = 0;
        for (int i = 1; i <= n; i++) {
            s = s + (float)1 / i;
        }
        System.out.println("Tong cua day so la " + s);
    }
}
