/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit01_HW;

import java.util.Scanner;

/**
 *
 * @author Linh
 */
public class Task03 {

    public static void main(String[] args) {
        Scanner ban_phim = new Scanner(System.in);
        System.out.println("Input a:");
        int a = ban_phim.nextInt();
        System.out.println("Input b:");
        int b = ban_phim.nextInt();
        int x = a + b;
        int y = a - b;
        int z = a * b;
        int t = a / b;
        int w = a % b;
        System.out.println(x + "\n");
        System.out.println(y + "\n");
        System.out.println(z + "\n");
        System.out.println(t + "\n");
        System.out.println(w + "\n");
    }
}
