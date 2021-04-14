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
public class Task01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input N:");
        int N = sc.nextInt();
        int s = 0;
        for (int i = 0; i < N; i++) {
            System.out.println("Input integer n:");
            int n = sc.nextInt();
            if (n < 0) {
                System.out.println("So nguyen n khong thoa man.");
            } else {
                if ((n % 4 == 0) || (((n - 300) % 1000) == 0)) {
                    s += n;
                }
            }
        }
        System.out.println("Sum is " + s);
    }
}
