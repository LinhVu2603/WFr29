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
public class Task10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input n = ");
        int n = sc.nextInt();
        int s = 1;
        for (int i = 1; i <= n; i++) {
            s = s * i;
        }
        System.out.println("Factorial n = " + s);
    }
}
