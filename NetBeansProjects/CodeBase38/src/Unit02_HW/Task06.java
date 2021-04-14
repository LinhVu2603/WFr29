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
public class Task06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input N: ");
        int N = sc.nextInt();
        int soam = 0;
        int soduong = 0;
        int sokhong = 0;
        for (int i = 1; i <= N; i++) {
            System.out.println("Input integer n: ");
            int n = sc.nextInt();
            if (n > 0) {
                soduong += 1;
            } else if (n < 0) {
                soam += 1;
            } else {
                sokhong += 1;
            }
        }
        System.out.println("Co " + soduong + " so duong!");
        System.out.println("Co " + soam + " so am!");
        System.out.println("Co " + sokhong + " so 0!");
    }
}
