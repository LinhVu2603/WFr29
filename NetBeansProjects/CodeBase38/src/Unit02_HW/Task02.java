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
public class Task02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input M = ");
        int M = sc.nextInt();
        System.out.println("Input K = ");
        int K = sc.nextInt();
        System.out.println("Input N = ");
        int N = sc.nextInt();
        if (N > M) {
            System.out.println("Input irregular!");
        }
        int s = 0;
        for (int i = N + 1; i < M; i++) {
            if (i % K == 0) {
                s = s + i;
            }
        }
        System.out.println("Sum is " + s);
    }
}
