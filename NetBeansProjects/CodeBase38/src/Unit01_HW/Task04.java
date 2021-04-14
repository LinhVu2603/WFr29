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
public class Task04 {

    public static void main(String[] args) {
        Scanner ban_phim = new Scanner(System.in);
        System.out.println("Input a:");
        int a = ban_phim.nextInt();
        System.out.println("Input b");
        int b = ban_phim.nextInt();
        int c = (a > b) ? a : b;
        System.out.println("The bigger number is " + c);
    }
}
