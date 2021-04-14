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
public class Task03_1 {

    public static void main(String[] args) {
        int num, n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n: ");
        num = sc.nextInt();
        System.out.println();
        n = num;
        // vẽ phần tam giác ngược
        for (int i = 1; i <= num; i++) {
            // phần 1
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            // phần 2
            for (int c = 1; c <= n; c++) {
                System.out.print("*");
            }
            // phần 3
            for (int c = num - i; c >= 1; c--) {
                System.out.print("*");
            }
            n--;
            System.out.println();
        }
    }
}
